package com.orangehrm.stepDefinitions;

import com.orangehrm.questions.InicioSesionQuestion;
import com.orangehrm.task.IniciarSesionTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.orangehrm.utils.Constantes.URL_PAGINA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class InicioSesioStepDefinition {


    @Before
    public void configuracion() {
        setTheStage(new OnlineCast());
    }

    @Dado("el usuario se encuentre en la pagina web")
    public void elUsuarioSeEncuentreEnLaPaginaWeb() {
        OnStage.theActorCalled("actor").wasAbleTo(Open.url(URL_PAGINA));
    }

    @Cuando("el usuario ingrese las credenciales y de clic en boton enviar")
    public void elUsuarioIngreseLasCredencialesYDeClicEnBotonEnviar() {
        OnStage.theActorCalled("actor").attemptsTo(
                IniciarSesionTask.ingresar()
        );
    }

    @Entonces("el usuario visualiza el mensaje de validacion")
    public void elUsuarioVisualizaElMensajeDeValidacion() {
        OnStage.theActorCalled("actor").should(
                seeThat(InicioSesionQuestion.esVisible())
        );
    }
}
