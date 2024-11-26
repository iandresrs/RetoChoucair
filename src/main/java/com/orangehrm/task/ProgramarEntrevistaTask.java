package com.orangehrm.task;

import com.orangehrm.utils.ObtenerDato;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.orangehrm.userInterfaces.EntrevistaUI.*;
import static com.orangehrm.userInterfaces.EtapaSolicitudUI.BTN_PROGRAMAR_ENTREVISTA;

public class ProgramarEntrevistaTask implements Task {

    private ObtenerDato dato = new ObtenerDato();

    @Override
    public <T extends Actor> void performAs(T t) {
        try {
            t.attemptsTo(
                    programarEntrevista(),
                    ingresarTituloEntrevista(),
                    seleccionarEntrevistador(),
                    seleccionarFechaEntrevista(),
                    seleccionarHora(),
                    guardarEntrevista()
            );
        } finally {
            dato.cerrarExcel();
        }
    }


    private Performable programarEntrevista() {
        return Task.where(
                Click.on(BTN_PROGRAMAR_ENTREVISTA)
        );
    }

    private Performable ingresarTituloEntrevista() {
        return Task.where(
                Enter.theValue("Entrevista").into(TXT_TITULO_ENTREVISTA)
        );
    }

    private Performable seleccionarEntrevistador() {
        return Task.where(
                Enter.theValue(dato.getEntrevistador()).into(TXT_ENTREVISTADOR),
                Click.on(LST_ENTREVISTADOR.of(dato.getEntrevistador()))
        );
    }

    private Performable seleccionarFechaEntrevista() {
        return Task.where(
                Enter.theValue(dato.getFechaEntrevista()).into(TXT_FECHA)
        );
    }

    private Performable seleccionarHora() {
        return Task.where(
                Click.on(TXT_HORA)
        );
    }


    private Performable guardarEntrevista() {
        return Task.where(
                Click.on(BTN_GUARDAR_ENTREVISTA)
        );
    }

    public static ProgramarEntrevistaTask programar() {
        return new ProgramarEntrevistaTask();
    }
}
