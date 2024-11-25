package com.orangehrm.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.orangehrm.userInterfaces.PaginaPrincipalUI.MSJ_VALIDACION_LOGIN;

public class InicioSesionQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return MSJ_VALIDACION_LOGIN.resolveFor(actor).isVisible();
    }

    public static Question<Boolean> esVisible(){
        return new InicioSesionQuestion();
    }
}
