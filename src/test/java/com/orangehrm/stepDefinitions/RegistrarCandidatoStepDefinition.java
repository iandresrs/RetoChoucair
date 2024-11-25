package com.orangehrm.stepDefinitions;

import com.orangehrm.questions.ModuloReclutamientoQuestion;
import com.orangehrm.task.AgregarCandidatoTask;
import com.orangehrm.task.IrModuloReclutamientoTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegistrarCandidatoStepDefinition {


    @Dado("que el usuario haga clic en el boton reclutamiento")
    public void queElUsuarioHagaClicEnElBotonReclutamiento() {
        OnStage.theActorCalled("actor").attemptsTo(
                IrModuloReclutamientoTask.ir()
        );
    }

    @Y("el usuario valida que esta en el modulo reclutamiento")
    public void elUsuarioValidaQueEstaEnElModuloReclutamiento() {
        OnStage.theActorCalled("actor").should(
                seeThat(ModuloReclutamientoQuestion.esVisible())
        );
    }

    @Cuando("usuario hace clic en boton agregar")
    public void usuarioHaceClicEnBotonAgregar() {
        OnStage.theActorCalled("actor").attemptsTo(
                AgregarCandidatoTask.agregar()
        );
    }

    @Y("el usuario llene el formulario con los datos del candidato")
    public void elUsuarioLleneElFormularioConLosDatosDelCandidato() {

    }

    @Y("el usuario haga clic en el boton guardar")
    public void elUsuarioHagaClicEnElBotonGuardar() {

    }
}
