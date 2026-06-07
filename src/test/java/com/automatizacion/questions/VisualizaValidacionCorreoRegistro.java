package com.automatizacion.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.By;

public class VisualizaValidacionCorreoRegistro implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String body = Serenity.getDriver()
                .findElement(By.tagName("body"))
                .getText()
                .toLowerCase();

        return body.contains("correo")
                || body.contains("email")
                || body.contains("inválido")
                || body.contains("invalido")
                || body.contains("formato")
                || body.contains("válido")
                || body.contains("valido");
    }

    public static VisualizaValidacionCorreoRegistro deCorreoInvalido() {
        return new VisualizaValidacionCorreoRegistro();
    }
}
