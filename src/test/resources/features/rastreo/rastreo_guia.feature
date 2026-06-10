Feature: Rastreo de envios por guia

  @domain @remote @stable @rastreo @happy
  Scenario: Visualizar pantalla de rastreo de envios
    Given que el visitante se encuentra en la pagina principal
    When navega a la opcion de rastrear envio
    Then deberia visualizar la pantalla de rastreo
