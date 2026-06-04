package com.automatizacion.questions;

import com.automatizacion.userinterfaces.DashboardPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class NotificacionesVisibles implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return DashboardPage.NOTIFICATIONS_OPTION.resolveFor(actor).isVisible();
    }

    public static NotificacionesVisibles delEnvio() {
        return new NotificacionesVisibles();
    }
}
