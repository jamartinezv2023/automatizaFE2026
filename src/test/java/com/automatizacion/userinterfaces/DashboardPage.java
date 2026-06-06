package com.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashboardPage {

    public static final Target MENU_INICIO =
            Target.the("menu inicio")
                    .located(By.xpath("//*[normalize-space()='Inicio']"));

    public static final Target MENU_RASTREAR =
            Target.the("menu rastrear envio")
                    .located(
                            By.cssSelector(
                                    "a[href='/rastrear'], " +
                                    "a[href*='rastrear'], " +
                                    "button[onclick*='rastrear']"
                            )
                    );

    public static final Target BOTON_CERRAR_SESION =
            Target.the("cerrar sesion")
                    .located(
                            By.xpath(
                                    "//*[contains(normalize-space(),'Cerrar sesión') " +
                                    "or contains(normalize-space(),'Cerrar sesion') " +
                                    "or contains(normalize-space(),'Salir')]"
                            )
                    );

    private DashboardPage() {}
}
