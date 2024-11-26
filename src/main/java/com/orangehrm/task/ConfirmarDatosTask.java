package com.orangehrm.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.orangehrm.userInterfaces.EtapaSolicitudUI.BTN_GUARDAR_DATOS_CANDIDATO;
import static com.orangehrm.userInterfaces.EtapaSolicitudUI.BTN_LISTA_CORTA;

public class ConfirmarDatosTask implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
            clicListaCorta(),
                clicGuardarDatos()
        );
    }

    private Performable clicListaCorta(){
        return Task.where(Click.on(BTN_LISTA_CORTA));
    }

    private Performable clicGuardarDatos(){
        return Task.where(Click.on(BTN_GUARDAR_DATOS_CANDIDATO));
    }


    public static ConfirmarDatosTask confirmar(){
        return new ConfirmarDatosTask();
    }
}
