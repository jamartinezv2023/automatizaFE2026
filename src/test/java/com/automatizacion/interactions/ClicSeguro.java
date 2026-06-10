package com.automatizacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClicSeguro implements Interaction {

    private final Target target;

    public ClicSeguro(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EsperarClickeable.de(target),
                Click.on(target)
        );
    }

    public static ClicSeguro en(Target target) {
        return instrumented(ClicSeguro.class, target);
    }
}
