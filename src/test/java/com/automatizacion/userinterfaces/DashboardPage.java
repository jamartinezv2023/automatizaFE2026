package com.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashboardPage {

    public static final Target DASHBOARD_TITLE =
            Target.the("titulo o contenido principal del dashboard")
                    .located(By.xpath("//*[contains(.,'Dashboard') or contains(.,'Tracking') or contains(.,'Logístico') or contains(.,'Logistico')]"));

    public static final Target CREATE_SHIPMENT_OPTION =
            Target.the("opcion crear envio")
                    .located(By.xpath("//*[contains(.,'Crear') or contains(.,'Nuevo envío') or contains(.,'Nuevo envio') or contains(.,'Envío') or contains(.,'Envio')]"));

    public static final Target TRACKING_OPTION =
            Target.the("opcion seguimiento")
                    .located(By.xpath("//*[contains(.,'Seguimiento') or contains(.,'Tracking')]"));

    public static final Target HISTORY_OPTION =
            Target.the("opcion historial")
                    .located(By.xpath("//*[contains(.,'Historial') or contains(.,'Historia')]"));

    public static final Target NOTIFICATIONS_OPTION =
            Target.the("opcion notificaciones")
                    .located(By.xpath("//*[contains(.,'Notificaciones') or contains(.,'Notificación')]"));

    private DashboardPage() {
    }
}
