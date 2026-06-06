package com.automatizacion.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.By;

public class VisualizaMensajeRastreo implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String body = Serenity.getDriver()
                .findElement(By.tagName("body"))
                .getText()
                .toLowerCase();

        System.out.println("BODY NORMALIZADO RASTREO => " + body);

        return body.contains("no encontrado")
                || body.contains("no encontrada")
                || body.contains("no existe")
                || body.contains("sin resultados")
                || body.contains("no se encontró")
                || body.contains("no se encontro")
                || body.contains("guía")
                || body.contains("guia");
    }

    public static VisualizaMensajeRastreo deGuiaNoEncontrada() {
        return new VisualizaMensajeRastreo();
    }
}
