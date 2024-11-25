package com.orangehrm.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.orangehrm.userInterfaces.PaginaPrincipalUI.BTN_RECLUTAMIENTO;

public class IrModuloReclutamientoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Click.on(BTN_RECLUTAMIENTO)
        );
    }

    public static IrModuloReclutamientoTask ir(){
        return new IrModuloReclutamientoTask();
    }
}
