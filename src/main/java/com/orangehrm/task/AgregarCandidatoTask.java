package com.orangehrm.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.orangehrm.userInterfaces.ModuloReclutamientoUI.BTN_AGREGAR_CANDIDATO;

public class AgregarCandidatoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Click.on(BTN_AGREGAR_CANDIDATO)
        );
    }

    public static AgregarCandidatoTask agregar(){
        return new AgregarCandidatoTask();
    }
}
