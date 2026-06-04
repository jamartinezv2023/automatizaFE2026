package com.automatizacion.questions;

import com.automatizacion.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VisualizaLogin implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            return LoginPage.EMAIL.resolveFor(actor).isVisible();
        } catch (Exception e) {
            return false;
        }
    }

    public static VisualizaLogin correctamente() {
        return new VisualizaLogin();
    }
}
