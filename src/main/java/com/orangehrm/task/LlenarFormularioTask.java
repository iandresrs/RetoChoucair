package com.orangehrm.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class LlenarFormularioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(

        );
    }

    public static LlenarFormularioTask llenar(){
        return new LlenarFormularioTask();
    }
}
