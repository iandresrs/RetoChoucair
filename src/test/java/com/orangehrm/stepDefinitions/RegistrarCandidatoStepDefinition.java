package com.orangehrm.stepDefinitions;

import com.orangehrm.questions.EstadoCandiatoQuestion;
import com.orangehrm.questions.ModuloReclutamientoQuestion;
import com.orangehrm.task.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
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

    @Y("el usuario llene el formulario con los datos del candidato y hace clic en el boton guardar")
    public void elUsuarioLleneElFormularioConLosDatosDelCandidatoYHaceClicEnElBotonGuardar() {
        OnStage.theActorCalled("actor").attemptsTo(
                LlenarFormularioTask.llenar()
        );
    }

    @Entonces("el usuario da clic en el boton lista corta y da clic en el boton guardar")
    public void elUsuarioDaClicEnElBotonListaCortaYDaClicEnElBotonGuardar() {
        OnStage.theActorCalled("actor").attemptsTo(
                ConfirmarDatosTask.confirmar()
        );
    }

    @Y("el usuario programa la entrevista con el candidato")
    public void elUsuarioProgramaLaEntrevistaConElCandidato() {
        OnStage.theActorCalled("actor").attemptsTo(
                ProgramarEntrevistaTask.programar()
        );
    }

    @Y("el usuario marca el candidato como aprobado")
    public void elUsuarioMarcaElCandidatoComoAprobado() {
        OnStage.theActorCalled("actor").attemptsTo(
                AprobarCandiatoTask.aprobar()
        );
    }

    @Y("el usuario se dirige a la seccion de registros encontrado")
    public void elUsuarioSeDirigeALaSeccionDeRegistrosEncontrado() {
        OnStage.theActorCalled("actor").attemptsTo(
                IrRegistrosEncontradosTask.ir()
        );
    }

    @Y("el usuario valida que el candido tiene estado contratado")
    public void elUsuarioValidaQueElCandidoTieneEstadoContratado() {
        OnStage.theActorCalled("actor").should(
                seeThat(EstadoCandiatoQuestion.estado())
        );
    }

}
