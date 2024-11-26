package com.orangehrm.questions;

import com.orangehrm.utils.ObtenerDato;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class EstadoCandiatoQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        ObtenerDato dato = new ObtenerDato();
        String nombreCandiato = dato.getPrimerNombre() + " " + dato.getSegundoNombre() + " " + dato.getApellido();
        Target estadoCandidato = Target.the("estado del candidato")
                .locatedBy("//div[@class='oxd-table-row oxd-table-row--with-border' and .//div[text()='{0}']]//div[text()='{1}']")
                .of(nombreCandiato, "Hired");

        // Verificar si el estado es visible
        return estadoCandidato.resolveFor(actor).isVisible();
    }

    public static EstadoCandiatoQuestion estado(){
        return new EstadoCandiatoQuestion();
    }
}
