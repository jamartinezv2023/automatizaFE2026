package com.automatizacion.tasks;

import com.automatizacion.userinterfaces.RastreoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class IntentarConsultarRastreoSinGuia implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(RastreoPage.BOTON_RASTREAR, isEnabled()).forNoMoreThan(20).seconds(),
                Click.on(RastreoPage.BOTON_RASTREAR)
        );
    }

    public static IntentarConsultarRastreoSinGuia enFormulario() {
        return instrumented(IntentarConsultarRastreoSinGuia.class);
    }
}
