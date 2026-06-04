package com.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroPage {

    public static final Target EMAIL = Target.the("correo electronico").located(By.id("email"));
    public static final Target PASSWORD = Target.the("contrasena").located(By.id("password"));
    public static final Target NOMBRE = Target.the("nombre").located(By.id("nombre"));
    public static final Target APELLIDO = Target.the("apellido").located(By.id("apellido"));
    public static final Target REGISTRARME = Target.the("boton registrarme").located(By.cssSelector("button[type='submit']"));

    private RegistroPage() {}
}
