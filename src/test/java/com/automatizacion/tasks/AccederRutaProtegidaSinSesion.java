package com.automatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AccederRutaProtegidaSinSesion implements Task {

    private static final String URL_DASHBOARD =
            "https://logistica-frontend-54fk.onrender.com/dashboard";

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(URL_DASHBOARD));
    }

    public static AccederRutaProtegidaSinSesion alDashboard() {
        return instrumented(AccederRutaProtegidaSinSesion.class);
    }
}
