package com.automatizacion.tasks;

import com.automatizacion.userinterfaces.RegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class IntentarRegistrarUsuarioSinDatos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(RegistroPage.REGISTRARME, isEnabled()).forNoMoreThan(20).seconds(),
                Click.on(RegistroPage.REGISTRARME)
        );
    }

    public static IntentarRegistrarUsuarioSinDatos enFormulario() {
        return instrumented(IntentarRegistrarUsuarioSinDatos.class);
    }
}
