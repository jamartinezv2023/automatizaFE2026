package com.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashboardPage {

    public static final Target MENU_INICIO =
            Target.the("menu inicio")
                    .located(By.xpath("//*[text()='Inicio']"));

    public static final Target MENU_RASTREAR =
            Target.the("menu rastrear envio")
                    .located(By.xpath("//*[contains(text(),'Rastrear envío')]"));

    public static final Target BOTON_CERRAR_SESION =
            Target.the("cerrar sesion")
                    .located(By.xpath("//*[contains(text(),'Cerrar sesión')]"));

    private DashboardPage() {}
}
