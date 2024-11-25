package com.orangehrm.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.orangehrm.userInterfaces.ModuloReclutamientoUI.VALIDACION_RECLUTAMIENTO;

public class ModuloReclutamientoQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return VALIDACION_RECLUTAMIENTO.resolveFor(actor).isVisible();
    }

    public static Question<Boolean> esVisible(){
        return new InicioSesionQuestion();
    }
}
