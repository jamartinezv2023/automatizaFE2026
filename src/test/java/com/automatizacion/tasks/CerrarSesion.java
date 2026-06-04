package com.automatizacion.tasks;

import com.automatizacion.userinterfaces.DashboardPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CerrarSesion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DashboardPage.BOTON_CERRAR_SESION, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(DashboardPage.BOTON_CERRAR_SESION)
        );
    }

    public static CerrarSesion delSistema() {
        return instrumented(CerrarSesion.class);
    }
}
