package com.automatizacion.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.By;

public class VisualizaValidacionesRegistro implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String body = Serenity.getDriver()
                .findElement(By.tagName("body"))
                .getText()
                .toLowerCase();

        return body.contains("correo")
                || body.contains("email")
                || body.contains("contraseña")
                || body.contains("password")
                || body.contains("nombre")
                || body.contains("requerido")
                || body.contains("obligatorio")
                || body.contains("campo");
    }

    public static VisualizaValidacionesRegistro deCamposObligatorios() {
        return new VisualizaValidacionesRegistro();
    }
}
