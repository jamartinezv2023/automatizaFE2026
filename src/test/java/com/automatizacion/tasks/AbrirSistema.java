package com.automatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirSistema implements Task {

    private static final String URL_LOGIN = "https://logistica-frontend-54fk.onrender.com/login?next=%2Fdashboard";

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(URL_LOGIN));
    }

    public static AbrirSistema deTrackingLogistico() {
        return instrumented(AbrirSistema.class);
    }
}
