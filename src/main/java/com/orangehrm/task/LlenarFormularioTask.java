package com.orangehrm.task;

import com.orangehrm.utils.ObtenerDato;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.orangehrm.userInterfaces.FormularioUI.*;
import static com.orangehrm.userInterfaces.ModuloReclutamientoUI.*;

public class LlenarFormularioTask implements Task {

    private ObtenerDato dato = new ObtenerDato();

    @Override
    public <T extends Actor> void performAs(T t) {
        try {
            t.attemptsTo(
                    ingresarPrimerNombre(),
                    ingresarSegundoNombre(),
                    ingresarApellido(),
                    seleccionarVacante(),
                    ingresarEmail(),
                    ingresarNumeroContacto(),
                    ingresarPalabraClave(),
                    ingresarNota(),
                    marcarConsentimiento(),
                    guardarDatos()
            );
        } finally {
            dato.cerrarExcel();
        }
    }

    private Performable ingresarPrimerNombre() {
        return Task.where(
                Enter.theValue(dato.getPrimerNombre()).into(TXT_PRIMER_NOMBRE)
        );
    }

    private Performable ingresarSegundoNombre() {
        return Task.where(
                Enter.theValue(dato.getSegundoNombre()).into(TXT_SEGUNDO_NOMBRE)
        );
    }

    private Performable ingresarApellido() {
        return Task.where(
                Enter.theValue(dato.getApellido()).into(TXT_APELLIDO)
        );
    }

    private Performable seleccionarVacante() {
        return Task.where(
                Click.on(LST_VACANTE),
                Click.on(ITEM_VACANTE.of(dato.getVacante()))
        );
    }

    private Performable ingresarEmail() {
        return Task.where(
                Enter.theValue(dato.getEmail()).into(TXT_EMAIL)
        );
    }

    private Performable ingresarNumeroContacto() {
        return Task.where(
                Enter.theValue(dato.getNumeroContacto()).into(TXT_NUMERO_CONTACTO)
        );
    }

    private Performable ingresarPalabraClave() {
        return Task.where(
                Enter.theValue(dato.getPalabraClave()).into(TXT_PALABRA_CLAVE)
        );
    }


    private Performable ingresarNota() {
        return Task.where(
                Enter.theValue(dato.getNota()).into(TXT_NOTA)
        );
    }


    private Performable marcarConsentimiento() {
        return Task.where(
                Click.on(CHK_CONSENTIMIENTO_DATOS)
        );
    }


    private Performable guardarDatos() {
        return Task.where(
                Click.on(BTN_GUARDAR_CANDIDATO)
        );
    }

    public static LlenarFormularioTask llenar() {
        return new LlenarFormularioTask();
    }
}
