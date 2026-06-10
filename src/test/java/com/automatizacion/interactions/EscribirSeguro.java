package com.automatizacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EscribirSeguro implements Interaction {

    private final String texto;
    private final Target target;

    public EscribirSeguro(String texto, Target target) {
        this.texto = texto;
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EsperarVisibilidad.de(target),
                Clear.field(target),
                Enter.theValue(texto).into(target)
        );
    }

    public static EscribirSeguro texto(String texto, Target target) {
        return instrumented(EscribirSeguro.class, texto, target);
    }
}
