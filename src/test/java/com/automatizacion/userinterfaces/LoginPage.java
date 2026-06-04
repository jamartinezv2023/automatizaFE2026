package com.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target EMAIL =
            Target.the("campo correo electronico")
                    .located(By.id("email"));

    public static final Target PASSWORD =
            Target.the("campo contrasena")
                    .located(By.id("password"));

    public static final Target LOGIN_BUTTON =
            Target.the("boton ingresar")
                    .located(By.cssSelector("button[type='submit']"));

    private LoginPage() {}
}
