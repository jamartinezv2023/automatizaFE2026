package com.automatizacion.tasks;

import com.automatizacion.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IntentarIniciarSesionConCredencialesInvalidas implements Task {

    private static final Target BOTON_INGRESAR = Target.the("boton ingresar")
            .located(By.cssSelector("button[type='submit'], button"));

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginPage.EMAIL, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue("usuario-invalido@test.com").into(LoginPage.EMAIL),
                Enter.theValue("PasswordIncorrecto123*").into(LoginPage.PASSWORD),
                WaitUntil.the(BOTON_INGRESAR, isEnabled()).forNoMoreThan(20).seconds(),
                Click.on(BOTON_INGRESAR)
        );
    }

    public static IntentarIniciarSesionConCredencialesInvalidas enFormulario() {
        return instrumented(IntentarIniciarSesionConCredencialesInvalidas.class);
    }
}
