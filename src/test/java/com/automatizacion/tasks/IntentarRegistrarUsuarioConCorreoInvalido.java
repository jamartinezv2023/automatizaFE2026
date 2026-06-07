package com.automatizacion.tasks;

import com.automatizacion.userinterfaces.RegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IntentarRegistrarUsuarioConCorreoInvalido implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(RegistroPage.EMAIL, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue("correo-invalido").into(RegistroPage.EMAIL),
                Enter.theValue("Password123*").into(RegistroPage.PASSWORD),
                Enter.theValue("Cliente").into(RegistroPage.NOMBRE),
                WaitUntil.the(RegistroPage.REGISTRARME, isEnabled()).forNoMoreThan(20).seconds(),
                Click.on(RegistroPage.REGISTRARME)
        );
    }

    public static IntentarRegistrarUsuarioConCorreoInvalido enFormulario() {
        return instrumented(IntentarRegistrarUsuarioConCorreoInvalido.class);
    }
}
