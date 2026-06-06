package com.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RastreoPage {

    public static final Target CAMPO_GUIA =
            Target.the("campo guia de rastreo")
                    .located(By.cssSelector(
                            "input[name='guia'], " +
                            "input[id*='guia'], " +
                            "input[placeholder*='guía'], " +
                            "input[placeholder*='guia'], " +
                            "input[placeholder*='rastreo'], " +
                            "input[type='text']"
                    ));

    public static final Target BOTON_RASTREAR =
            Target.the("boton rastrear envio")
                    .located(By.xpath(
                            "//button[contains(.,'Rastrear') " +
                            "or contains(.,'Consultar') " +
                            "or contains(.,'Buscar')]"
                    ));

    public static final Target MENSAJE_RESULTADO =
            Target.the("mensaje resultado rastreo")
                    .located(By.xpath(
                            "//*[contains(translate(.,'ABCDEFGHIJKLMNOPQRSTUVWXYZÁÉÍÓÚ','abcdefghijklmnopqrstuvwxyzáéíóú'),'no encontrada') " +
                            "or contains(translate(.,'ABCDEFGHIJKLMNOPQRSTUVWXYZÁÉÍÓÚ','abcdefghijklmnopqrstuvwxyzáéíóú'),'no encontrado') " +
                            "or contains(translate(.,'ABCDEFGHIJKLMNOPQRSTUVWXYZÁÉÍÓÚ','abcdefghijklmnopqrstuvwxyzáéíóú'),'no existe') " +
                            "or contains(translate(.,'ABCDEFGHIJKLMNOPQRSTUVWXYZÁÉÍÓÚ','abcdefghijklmnopqrstuvwxyzáéíóú'),'sin resultados')]"
                    ));

    private RastreoPage() {}
}
