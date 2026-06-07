package com.automatizacion.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.By;

public class VisualizaValidacionGuiaRastreo implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String body = Serenity.getDriver()
                .findElement(By.tagName("body"))
                .getText()
                .toLowerCase();

        return body.contains("guia")
                || body.contains("guía")
                || body.contains("rastreo")
                || body.contains("requerido")
                || body.contains("obligatorio")
                || body.contains("campo")
                || body.contains("ingrese");
    }

    public static VisualizaValidacionGuiaRastreo deCampoObligatorio() {
        return new VisualizaValidacionGuiaRastreo();
    }
}
