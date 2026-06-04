package com.automatizacion.questions;

import com.automatizacion.userinterfaces.DashboardPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VisualizaDashboardCliente implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean inicio =
                DashboardPage.MENU_INICIO.resolveFor(actor).isVisible();

        boolean rastrear =
                DashboardPage.MENU_RASTREAR.resolveFor(actor).isVisible();

        boolean logout =
                DashboardPage.BOTON_CERRAR_SESION.resolveFor(actor).isVisible();

        return inicio && rastrear && logout;
    }

    public static VisualizaDashboardCliente correctamente() {
        return new VisualizaDashboardCliente();
    }
}
