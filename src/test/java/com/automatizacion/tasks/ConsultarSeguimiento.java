package com.automatizacion.tasks;

import com.automatizacion.userinterfaces.DashboardPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultarSeguimiento implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DashboardPage.TRACKING_OPTION)
        );
    }

    public static ConsultarSeguimiento delEnvio() {
        return instrumented(ConsultarSeguimiento.class);
    }
}
