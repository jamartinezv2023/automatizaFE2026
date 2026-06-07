package com.automatizacion.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.By;

public class VisualizaValidacionesLogin implements Question<Boolean> {

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
                || body.contains("requerido")
                || body.contains("obligatorio")
                || body.contains("campo")
                || body.contains("ingresar");
    }

    public static VisualizaValidacionesLogin deCamposObligatorios() {
        return new VisualizaValidacionesLogin();
    }
}
