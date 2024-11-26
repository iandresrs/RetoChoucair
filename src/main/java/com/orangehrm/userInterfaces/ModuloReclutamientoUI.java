package com.orangehrm.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ModuloReclutamientoUI {


    public static final Target VALIDACION_RECLUTAMIENTO = Target
            .the("texto de validación para confirmar que se está en la sección de reclutamiento")
            .locatedBy("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");

    public static final Target BTN_AGREGAR_CANDIDATO = Target
            .the("botón para agregar un nuevo candidato")
            .locatedBy("//button[text()=' Add ']");

    public static final Target BTN_GUARDAR_CANDIDATO = Target
            .the("botón para guardar la información del candidato")
            .locatedBy("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");



}
