package com.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target EMAIL =
            Target.the("campo correo electronico")
                    .located(By.cssSelector("input[type='email'], input[name='email'], input[placeholder*='correo'], input[placeholder*='email']"));

    public static final Target PASSWORD =
            Target.the("campo contrasena")
                    .located(By.cssSelector("input[type='password'], input[name='password']"));

    public static final Target LOGIN_BUTTON =
            Target.the("boton iniciar sesion")
                    .located(By.xpath("//button[contains(.,'Login') or contains(.,'Iniciar') or contains(.,'Ingresar')]"));

    private LoginPage() {
    }
}
