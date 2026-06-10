package com.automatizacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PausaCorta implements Interaction {

    private final int millis;

    public PausaCorta(int millis) {
        this.millis = millis;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static PausaCorta de(int millis) {
        return instrumented(PausaCorta.class, millis);
    }
}
