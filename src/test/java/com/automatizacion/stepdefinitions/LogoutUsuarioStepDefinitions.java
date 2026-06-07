package com.automatizacion.stepdefinitions;

import com.automatizacion.questions.VisualizaLogin;
import com.automatizacion.tasks.CerrarSesion;
import com.automatizacion.tasks.RegistrarUsuario;
import com.automatizacion.userinterfaces.DashboardPage;
import com.automatizacion.userinterfaces.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;

public class LogoutUsuarioStepDefinitions {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogoutUsuarioStepDefinitions.class);


    @Before
    public void prepararEscenario() {
        setTheStage(new OnlineCast());
    }

    @Given("que el cliente se registro exitosamente")
    public void queElClienteSeRegistroExitosamente() {
        String email = "logout-" + UUID.randomUUID() + "@test.com";

        LOGGER.info("{}", "EMAIL LOGOUT GENERADO => " + email);

        theActorCalled("Cliente").attemptsTo(
                Open.url("https://logistica-frontend-54fk.onrender.com/registro"),
                RegistrarUsuario.conDatos(
                        email,
                        "Password123",
                        "Cliente",
                        "Logout"
                ),
                WaitUntil.the(DashboardPage.BOTON_CERRAR_SESION, isVisible()).forNoMoreThan(40).seconds()
        );
    }

    @When("cierra la sesion desde el dashboard")
    public void cierraLaSesionDesdeElDashboard() {
        theActorInTheSpotlight().attemptsTo(
                CerrarSesion.delSistema()
        );
    }

    @Then("deberia visualizar nuevamente la pantalla de inicio de sesion")
    public void deberiaVisualizarNuevamenteLaPantallaDeInicioDeSesion() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(LoginPage.EMAIL, isVisible()).forNoMoreThan(40).seconds()
        );

        theActorInTheSpotlight().should(
                seeThat(VisualizaLogin.correctamente(), equalTo(true))
        );
    }
}
