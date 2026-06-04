package com.automatizacion.stepdefinitions;

import com.automatizacion.questions.NotificacionesVisibles;
import com.automatizacion.tasks.AbrirSistema;
import com.automatizacion.tasks.ConsultarSeguimiento;
import com.automatizacion.tasks.CrearEnvio;
import com.automatizacion.tasks.IniciarSesion;
import com.automatizacion.tasks.RevisarHistorial;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class TrackingLogisticoStepDefinitions {

    @Before
    public void prepararEscenario() {
        setTheStage(new OnlineCast());
    }

    @Given("que Jose ingresa al sistema de tracking logistico")
    public void queJoseIngresaAlSistemaDeTrackingLogistico() {
        theActorCalled("Jose").attemptsTo(
                AbrirSistema.deTrackingLogistico()
        );
    }

    @When("inicia sesion con credenciales validas")
    public void iniciaSesionConCredencialesValidas() {
        theActorInTheSpotlight().attemptsTo(
                IniciarSesion.conCredenciales(
                        System.getProperty("usuario", "admin@test.com"),
                        System.getProperty("clave", "admin123")
                )
        );
    }

    @And("crea un nuevo envio logistico")
    public void creaUnNuevoEnvioLogistico() {
        theActorInTheSpotlight().attemptsTo(
                CrearEnvio.logistico()
        );
    }

    @And("consulta el seguimiento del envio")
    public void consultaElSeguimientoDelEnvio() {
        theActorInTheSpotlight().attemptsTo(
                ConsultarSeguimiento.delEnvio()
        );
    }

    @And("revisa el historial del envio")
    public void revisaElHistorialDelEnvio() {
        theActorInTheSpotlight().attemptsTo(
                RevisarHistorial.delEnvio()
        );
    }

    @Then("deberia visualizar las notificaciones del ciclo de vida del envio")
    public void deberiaVisualizarLasNotificacionesDelCicloDeVidaDelEnvio() {
        theActorInTheSpotlight().should(
                seeThat(NotificacionesVisibles.delEnvio(), equalTo(true))
        );
    }
}
