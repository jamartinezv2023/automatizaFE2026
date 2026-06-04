Feature: Sistema de tracking logistico

  Como usuario del sistema logistico
  Quiero registrar y consultar el ciclo de vida de un envio en tiempo real
  Para hacer seguimiento tipo FedEx desde login hasta notificaciones

  Scenario: Flujo completo del ciclo de vida de un envio
    Given que Jose ingresa al sistema de tracking logistico
    When inicia sesion con credenciales validas
    And crea un nuevo envio logistico
    And consulta el seguimiento del envio
    And revisa el historial del envio
    Then deberia visualizar las notificaciones del ciclo de vida del envio
