package com.orangehrm.task;

import com.orangehrm.utils.LeerDatosExcel;
import com.orangehrm.utils.ObtenerDato;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.orangehrm.userInterfaces.LoginUI.*;

public class IniciarSesionTask implements Task {


    private ObtenerDato dato = new ObtenerDato();


    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    ingresarUsuario(),
                    ingresarClave(),
                    clicInciarSesion()
            );
        } finally {
            dato.cerrarExcel();
        }
    }

    private Performable ingresarUsuario() {
        return Task.where(
                Enter.theValue(dato.getUsuario()).into(TXT_USUARIO)
        );
    }

    private Performable ingresarClave() {
        return Task.where(
                Enter.theValue(dato.getClave()).into(TXT_CLAVE)
        );
    }

    private Performable clicInciarSesion() {
        return Task.where(
                Click.on(BTN_INICIAR_SESION)
        );
    }


    public static IniciarSesionTask ingresar() {
        return new IniciarSesionTask();
    }
}
