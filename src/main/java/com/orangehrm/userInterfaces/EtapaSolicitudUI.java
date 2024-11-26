package com.orangehrm.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class EtapaSolicitudUI {



    public static final Target MSJ_VALIDACION_DATOS = Target
            .the("")
            .locatedBy("//h6[text()='Application Stage']");

    public static final Target BTN_LISTA_CORTA = Target
            .the("")
            .locatedBy("//button[@class='oxd-button oxd-button--medium oxd-button--success']");


    public static final Target BTN_GUARDAR_DATOS_CANDIDATO = Target
            .the("")
            .locatedBy("//button[@type='submit']");

    public static final Target BTN_PROGRAMAR_ENTREVISTA = Target
            .the("")
            .locatedBy("//button[normalize-space()='Schedule Interview']");


    public static final Target BTN_APROBAR_CANDIDATO = Target
            .the("")
            .locatedBy("//button[normalize-space()='Mark Interview Passed']");

    public static final Target BTN_GUARDAR_APROBADO = Target
            .the("")
            .locatedBy("//button[@type='submit']");

    public static final Target BTN_OFRECER_TRABAJO= Target
            .the("")
            .locatedBy("//button[normalize-space()='Offer Job']");

    public static final Target BTN_CONTRATAR= Target
            .the("")
            .locatedBy("//button[normalize-space()='Hire']");

}
