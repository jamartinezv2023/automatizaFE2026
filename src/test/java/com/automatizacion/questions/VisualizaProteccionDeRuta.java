package com.automatizacion.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.By;

public class VisualizaProteccionDeRuta implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String url = Serenity.getDriver().getCurrentUrl().toLowerCase();
        String body = Serenity.getDriver().findElement(By.tagName("body")).getText().toLowerCase();

        return url.contains("/login")
                || body.contains("iniciar sesión")
                || body.contains("iniciar sesion")
                || body.contains("correo electrónico")
                || body.contains("correo electronico")
                || body.contains("contraseña");
    }

    public static VisualizaProteccionDeRuta paraUsuarioNoAutenticado() {
        return new VisualizaProteccionDeRuta();
    }
}
