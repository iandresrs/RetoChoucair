package com.orangehrm.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {

    public static final Target TXT_USUARIO = Target
            .the("Campo de texto para usuario")
            .locatedBy("//input[@name='username']");

    public static final Target TXT_CLAVE = Target
            .the("Campo de texto para la clave")
            .locatedBy("//input[@name='password']");


    public static final Target BTN_INICIAR_SESION = Target
            .the("Boton de inicio de sesio")
            .locatedBy("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");

}
