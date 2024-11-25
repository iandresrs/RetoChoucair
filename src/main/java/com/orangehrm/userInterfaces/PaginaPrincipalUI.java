package com.orangehrm.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipalUI {

    public static final Target MSJ_VALIDACION_LOGIN = Target
            .the("mensaje de validacion que aparece despues de intentar iniciar sesion")
            .locatedBy("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");

    public static final Target BTN_RECLUTAMIENTO = Target
            .the("boton para acceder al modulo de reclutamiento")
            .locatedBy("//span[text()='Recruitment']");
}
