package com.orangehrm.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.orangehrm.userInterfaces.EtapaSolicitudUI.BTN_LISTA_CORTA;

public class LlenarFormularioQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return BTN_LISTA_CORTA.resolveFor(actor).isVisible();
    }

    public static Question<Boolean> esVisible() {
        return new LlenarFormularioQuestion();
    }
}
