package com.orangehrm.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ModuloReclutamientoUI {


    public static final Target VALIDACION_RECLUTAMIENTO = Target
            .the("")
            .locatedBy("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");

    public static final Target BTN_AGREGAR_CANDIDATO = Target
            .the("")
            .locatedBy("//button[text()=' Add ']");

    // Informacion del candidato

}
