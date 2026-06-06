package com.automatizacion.tasks;

import com.automatizacion.userinterfaces.RastreoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConsultarGuia implements Task {

    private final String guia;

    public ConsultarGuia(String guia) {
        this.guia = guia;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(RastreoPage.CAMPO_GUIA, isVisible()).forNoMoreThan(30).seconds(),
                WaitUntil.the(RastreoPage.CAMPO_GUIA, isEnabled()).forNoMoreThan(30).seconds(),
                Enter.theValue(guia).into(RastreoPage.CAMPO_GUIA),
                WaitUntil.the(RastreoPage.BOTON_RASTREAR, isEnabled()).forNoMoreThan(20).seconds(),
                Click.on(RastreoPage.BOTON_RASTREAR)
        );
    }

    public static ConsultarGuia conNumero(String guia) {
        return instrumented(ConsultarGuia.class, guia);
    }
}
