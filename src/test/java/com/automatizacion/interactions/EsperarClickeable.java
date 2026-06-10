package com.automatizacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class EsperarClickeable implements Interaction {

    private final Target target;
    private final int seconds;

    public EsperarClickeable(Target target, int seconds) {
        this.target = target;
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(target, isClickable()).forNoMoreThan(seconds).seconds()
        );
    }

    public static EsperarClickeable de(Target target) {
        return instrumented(EsperarClickeable.class, target, 15);
    }

    public static EsperarClickeable de(Target target, int seconds) {
        return instrumented(EsperarClickeable.class, target, seconds);
    }
}
