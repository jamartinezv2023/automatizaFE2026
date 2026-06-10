package com.automatizacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EsperarVisibilidad implements Interaction {

    private final Target target;
    private final int seconds;

    public EsperarVisibilidad(Target target, int seconds) {
        this.target = target;
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(target, isVisible()).forNoMoreThan(seconds).seconds()
        );
    }

    public static EsperarVisibilidad de(Target target) {
        return instrumented(EsperarVisibilidad.class, target, 15);
    }

    public static EsperarVisibilidad de(Target target, int seconds) {
        return instrumented(EsperarVisibilidad.class, target, seconds);
    }
}
