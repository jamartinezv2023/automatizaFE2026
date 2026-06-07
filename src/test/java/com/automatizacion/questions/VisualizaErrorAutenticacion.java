package com.automatizacion.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.By;

public class VisualizaErrorAutenticacion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String body = Serenity.getDriver()
                .findElement(By.tagName("body"))
                .getText()
                .toLowerCase();

        return body.contains("credenciales")
                || body.contains("incorrect")
                || body.contains("inval")
                || body.contains("no autorizado")
                || body.contains("unauthorized")
                || body.contains("error")
                || body.contains("login")
                || body.contains("ingresar");
    }

    public static VisualizaErrorAutenticacion porCredencialesInvalidas() {
        return new VisualizaErrorAutenticacion();
    }
}
