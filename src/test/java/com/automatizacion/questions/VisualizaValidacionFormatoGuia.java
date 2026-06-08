package com.automatizacion.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VisualizaValidacionFormatoGuia implements Question<Boolean> {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(VisualizaValidacionFormatoGuia.class);

    @Override
    public Boolean answeredBy(Actor actor) {

        String url = Serenity.getDriver()
                .getCurrentUrl()
                .toLowerCase();

        String body = Serenity.getDriver()
                .findElement(By.tagName("body"))
                .getText()
                .toLowerCase();

        LOGGER.info("RASTREO FORMATO INVALIDO URL => {}", url);
        LOGGER.info("RASTREO FORMATO INVALIDO BODY => {}", body);

        return url.contains("/rastrear")
                || body.contains("rastrear")
                || body.contains("rastreo")
                || body.contains("guia")
                || body.contains("guía")
                || body.contains("no encontrado")
                || body.contains("no encontrada")
                || body.contains("formato")
                || body.contains("invalido")
                || body.contains("inválido");
    }

    public static VisualizaValidacionFormatoGuia esVisible() {
        return new VisualizaValidacionFormatoGuia();
    }

    public static VisualizaValidacionFormatoGuia deFormatoInvalido() {
        return new VisualizaValidacionFormatoGuia();
    }
}
