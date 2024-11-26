package com.orangehrm.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioUI {

    public static final Target TXT_PRIMER_NOMBRE = Target
            .the("campo de texto para ingresar el primer nombre del candidato")
            .locatedBy("//input[@name='firstName']");

    public static final Target TXT_SEGUNDO_NOMBRE = Target
            .the("campo de texto para ingresar el segundo nombre del candidato")
            .locatedBy("//input[@name='middleName']");

    public static final Target TXT_APELLIDO = Target
            .the("campo de texto para ingresar el apellido del candidato")
            .locatedBy("//input[@name='lastName']");


    public static final Target LST_VACANTE = Target
            .the("lista desplegable para seleccionar la vacante")
            .locatedBy("//div[@class='oxd-select-text oxd-select-text--active']");

    public static final Target ITEM_VACANTE = Target
            .the("lista desplegable para seleccionar la vacante")
            .locatedBy("//div[@role='listbox']/div/span[contains(text(),'{0}')]");

    public static final Target TXT_EMAIL = Target
            .the("campo de texto para ingresar el correo electrónico del candidato")
            .locatedBy("(//input[@class='oxd-input oxd-input--active'])[2]");

    public static final Target TXT_NUMERO_CONTACTO = Target
            .the("campo de texto para ingresar el número de contacto del candidato")
            .locatedBy("(//div[@data-v-957b4417='']//input[@placeholder='Type here'])[2]");

    public static final Target TXT_PALABRA_CLAVE = Target
            .the("campo de texto para ingresar palabras clave relacionadas con el candidato")
            .locatedBy("//input[@class='oxd-input oxd-input--active' and @placeholder='Enter comma seperated words...']");

    public static final Target TXT_FECHA_APLICACION = Target
            .the("campo de texto para ingresar la fecha de aplicación")
            .locatedBy("//input[@placeholder='yyyy-dd-mm']");

    public static final Target TXT_NOTA = Target
            .the("área de texto para ingresar notas adicionales sobre el candidato")
            .locatedBy("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']");

    public static final Target CHK_CONSENTIMIENTO_DATOS = Target
            .the("casilla de verificación para aceptar el consentimiento de datos")
            .locatedBy("//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input']");

}
