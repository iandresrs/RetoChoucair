package com.orangehrm.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class EntrevistaUI {

    public static final Target TXT_TITULO_ENTREVISTA = Target
            .the("")
            .locatedBy("(//input[@class='oxd-input oxd-input--active'])[6]");

    public static final Target TXT_ENTREVISTADOR = Target
            .the("")
            .locatedBy("//input[@placeholder='Type for hints...']");

    public static final Target LST_ENTREVISTADOR = Target
            .the("")
            .locatedBy("//div[@role='listbox']/div/span[contains(text(),'{0}')]");
    public static final Target TXT_FECHA = Target
            .the("")
            .locatedBy("(//input[@class='oxd-input oxd-input--active'])[7]");

    public static final Target TXT_HORA = Target
            .the("")
            .locatedBy("//input[@placeholder='hh:mm']");
    //input[@placeholder='hh:mm']
    public static final Target BTN_GUARDAR_ENTREVISTA = Target
            .the("")
            .locatedBy("//button[@type='submit']");




}
