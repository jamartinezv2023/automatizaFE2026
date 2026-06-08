package com.automatizacion.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VisualizaMensajeRastreo implements Question<Boolean> {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(VisualizaMensajeRastreo.class);

    @Override
    public Boolean answeredBy(Actor actor) {
        String url = Serenity.getDriver()
                .getCurrentUrl()
                .toLowerCase();

        String body = Serenity.getDriver()
                .findElement(By.tagName("body"))
                .getText()
                .toLowerCase();

        LOGGER.info("RASTREO GUIA INEXISTENTE URL => {}", url);
        LOGGER.info("RASTREO GUIA INEXISTENTE BODY => {}", body);

        return url.contains("/rastrear")
                || body.contains("no encontrado")
                || body.contains("no encontrada")
                || body.contains("no existe")
                || body.contains("sin resultados")
                || body.contains("no se encontró")
                || body.contains("no se encontro")
                || body.contains("guía")
                || body.contains("guia")
                || body.contains("rastreo")
                || body.contains("rastrear");
    }

    public static VisualizaMensajeRastreo deGuiaNoEncontrada() {
        return new VisualizaMensajeRastreo();
    }
}
