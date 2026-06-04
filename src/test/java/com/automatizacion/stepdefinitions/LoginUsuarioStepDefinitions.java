package com.automatizacion.stepdefinitions;

import com.automatizacion.questions.VisualizaDashboardCliente;
import com.automatizacion.tasks.IniciarSesion;
import com.automatizacion.userinterfaces.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;

public class LoginUsuarioStepDefinitions {

    @Before
    public void prepararEscenario() {
        setTheStage(new OnlineCast());
    }

    @Given("que el cliente se encuentra en la pantalla de inicio de sesion")
    public void queElClienteSeEncuentraEnLaPantallaDeInicioDeSesion() {
        theActorCalled("Cliente").attemptsTo(
                Open.url("https://logistica-frontend-54fk.onrender.com/login?next=%2Fdashboard"),
                WaitUntil.the(LoginPage.EMAIL, isVisible()).forNoMoreThan(40).seconds()
        );
    }

    @When("inicia sesion con sus credenciales validas")
    public void iniciaSesionConSusCredencialesValidas() {
        theActorInTheSpotlight().attemptsTo(
                IniciarSesion.conCredenciales(
                        System.getProperty("usuario", "jamartinezv2020@gmail.com"),
                        System.getProperty("clave", "Password123")
                )
        );
    }

    @Then("deberia visualizar el dashboard del cliente autenticado")
    public void deberiaVisualizarElPanelPrincipalDelCliente() {
        WebDriver driver = BrowseTheWeb.as(theActorInTheSpotlight()).getDriver();

        String url = driver.getCurrentUrl();
        String titulo = driver.getTitle();
        String body = driver.findElement(org.openqa.selenium.By.tagName("body")).getText();

        System.out.println("LOGIN URL ACTUAL => " + url);
        System.out.println("LOGIN TITULO ACTUAL => " + titulo);
        System.out.println("LOGIN BODY ACTUAL => " + body);

        Serenity.recordReportData()
                .withTitle("Estado posterior al login")
                .andContents("URL: " + url + "\n\nTITLE: " + titulo + "\n\nBODY:\n" + body);

        theActorInTheSpotlight().should(
                seeThat(VisualizaDashboardCliente.correctamente(), equalTo(true))
        );
    }
}
