package com.automatizacion.stepdefinitions;

import com.automatizacion.userinterfaces.DashboardPage;
import com.automatizacion.userinterfaces.RastreoPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.containsString;

public class RastreoGuiaStepDefinitions {

    private static final Logger LOGGER = LoggerFactory.getLogger(RastreoGuiaStepDefinitions.class);


    private static final String URL_BASE =
            "https://logistica-frontend-54fk.onrender.com/";

    @Before
    public void prepararEscenario() {
        setTheStage(new OnlineCast());
    }

    @Given("que el visitante se encuentra en la pagina principal")
    public void queElVisitanteSeEncuentraEnLaPaginaPrincipal() {
        theActorCalled("Visitante").attemptsTo(
                Open.url(URL_BASE),
                WaitUntil.the(DashboardPage.MENU_RASTREAR, isVisible()).forNoMoreThan(40).seconds()
        );
    }

    @When("navega a la opcion de rastrear envio")
    public void navegaALaOpcionDeRastrearEnvio() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(DashboardPage.MENU_RASTREAR)
        );
    }

    @Then("deberia visualizar la pantalla de rastreo")
    public void deberiaVisualizarLaPantallaDeRastreo() {
        WebDriver driver = Serenity.getDriver();

        LOGGER.info("{}", "RASTREO URL ACTUAL => " + driver.getCurrentUrl());
        LOGGER.info("{}", "RASTREO BODY ACTUAL => " + driver.findElement(By.tagName("body")).getText());

        theActorInTheSpotlight().should(
                seeThat(actor -> driver.getCurrentUrl(), containsString("/rastrear"))
        );
    }
}
