package com.orangehrm.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.orangehrm.userInterfaces.EtapaSolicitudUI.*;

public class AprobarCandiatoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Click.on(BTN_APROBAR_CANDIDATO),
                Click.on(BTN_GUARDAR_APROBADO),
                Click.on(BTN_OFRECER_TRABAJO),
                Click.on(BTN_GUARDAR_APROBADO),
                Click.on(BTN_CONTRATAR),
                Click.on(BTN_GUARDAR_APROBADO)
        );
    }

    public static AprobarCandiatoTask aprobar(){
        return new AprobarCandiatoTask();
    }
}
