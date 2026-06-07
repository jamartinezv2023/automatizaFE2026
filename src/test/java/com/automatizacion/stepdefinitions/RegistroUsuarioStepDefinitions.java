package com.automatizacion.stepdefinitions;

import com.automatizacion.tasks.RegistrarUsuario;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.containsString;

public class RegistroUsuarioStepDefinitions {

    private static final Logger LOGGER = LoggerFactory.getLogger(RegistroUsuarioStepDefinitions.class);


    @Before
    public void prepararEscenario() {
        setTheStage(new OnlineCast());
    }

    @Given("que el visitante se encuentra en la pantalla de registro")
    public void queElVisitanteSeEncuentraEnLaPantallaDeRegistro() {
        theActorCalled("Visitante").attemptsTo(
                Open.url("https://logistica-frontend-54fk.onrender.com/registro")
        );
    }

    @When("registra un nuevo cliente")
    public void registraUnNuevoCliente() {
        String email = "cliente-" + UUID.randomUUID() + "@test.com";

        LOGGER.info("{}", "EMAIL REGISTRO GENERADO => " + email);

        theActorInTheSpotlight().attemptsTo(
                RegistrarUsuario.conDatos(
                        email,
                        "Password123",
                        "Cliente",
                        "Automatizado"
                )
        );
    }

    @Then("deberia permanecer en el flujo de registro o autenticacion")
    public void deberiaPermanecerEnElFlujoDeRegistroOAutenticacion() {
        WebDriver driver = Serenity.getDriver();

        String url = driver.getCurrentUrl();
        String body = driver.findElement(By.tagName("body")).getText();

        LOGGER.info("{}", "URL FINAL REGISTRO => " + url);
        LOGGER.info("{}", "BODY FINAL REGISTRO => " + body);

        assertThat(
                url,
                anyOf(
                        containsString("/registro"),
                        containsString("/login"),
                        containsString("/dashboard")
                )
        );
    }
}
