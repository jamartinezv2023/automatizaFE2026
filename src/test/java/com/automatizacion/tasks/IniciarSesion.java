package com.automatizacion.tasks;

import com.automatizacion.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IniciarSesion implements Task {

    private final String usuario;
    private final String clave;

    public IniciarSesion(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginPage.EMAIL, isVisible()).forNoMoreThan(30).seconds(),
                WaitUntil.the(LoginPage.EMAIL, isEnabled()).forNoMoreThan(30).seconds(),
                Enter.theValue(usuario).into(LoginPage.EMAIL),
                Enter.theValue(clave).into(LoginPage.PASSWORD),
                WaitUntil.the(LoginPage.LOGIN_BUTTON, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }

    public static IniciarSesion conCredenciales(String usuario, String clave) {
        return instrumented(IniciarSesion.class, usuario, clave);
    }
}
