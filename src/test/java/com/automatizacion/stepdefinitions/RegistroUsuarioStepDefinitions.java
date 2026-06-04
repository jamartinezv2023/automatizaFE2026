package com.automatizacion.stepdefinitions;

import com.automatizacion.questions.VisualizaDashboardCliente;
import com.automatizacion.tasks.RegistrarUsuario;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;

public class RegistroUsuarioStepDefinitions {

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
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        String email = "cliente" + timestamp + "@test.com";

        Serenity.recordReportData()
                .withTitle("Correo generado para registro")
                .andContents(email);

        theActorInTheSpotlight().attemptsTo(
                RegistrarUsuario.conDatos(
                        email,
                        "Password123",
                        "Cliente",
                        "Automatizado"
                )
        );
    }

    @Then("deberia visualizar el panel principal del cliente")
    public void deberiaVisualizarElPanelPrincipalDelCliente() {
        WebDriver driver = BrowseTheWeb.as(theActorInTheSpotlight()).getDriver();

        String url = driver.getCurrentUrl();
        String titulo = driver.getTitle();
        String body = driver.findElement(org.openqa.selenium.By.tagName("body")).getText();

        System.out.println("URL ACTUAL => " + url);
        System.out.println("TITULO ACTUAL => " + titulo);
        System.out.println("BODY ACTUAL => " + body);

        Serenity.recordReportData()
                .withTitle("Estado posterior al registro")
                .andContents(
                        "URL: " + url + "\n\n" +
                        "TITLE: " + titulo + "\n\n" +
                        "BODY:\n" + body
                );

        theActorInTheSpotlight().should(
                seeThat(VisualizaDashboardCliente.correctamente(), equalTo(true))
        );
    }
}
