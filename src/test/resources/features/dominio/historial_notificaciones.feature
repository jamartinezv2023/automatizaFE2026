Feature: Historial y notificaciones del envio

  @happy @historial
  Scenario: Visualizar historial de un envio con eventos
    Given que existe un envio con eventos de seguimiento
    When el cliente consulta el historial del envio
    Then deberia visualizar los eventos del ciclo de vida

  @exception @historial
  Scenario: Visualizar historial de envio sin eventos
    Given que existe un envio sin eventos de seguimiento
    When el cliente consulta el historial
    Then deberia ver un mensaje indicando que no hay eventos disponibles

  @happy @notificaciones
  Scenario: Visualizar notificaciones del ciclo de vida
    Given que existe un envio con cambios de estado
    When el cliente consulta sus notificaciones
    Then deberia visualizar notificaciones asociadas al envio

  @exception @notificaciones
  Scenario: Servicio de notificaciones no disponible
    Given que el servicio de notificaciones no responde correctamente
    When el cliente consulta el dashboard
    Then el sistema no deberia bloquear la operacion principal
