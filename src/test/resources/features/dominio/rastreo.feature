@ignore @legacy-rastreo
Feature: Rastreo de envios

  @discovery @legacy-rastreo @happy
  Scenario: Consultar envio por guia existente
    Given que existe un envio registrado con guia valida
    When el cliente consulta la guia
    Then deberia visualizar el estado actual del envio

  @discovery @legacy-rastreo @exception
  Scenario: Consultar guia inexistente
    Given que el cliente se encuentra en rastreo
    When consulta una guia que no existe
    Then deberia ver un mensaje de guia no encontrada

  @discovery @legacy-rastreo @exception
  Scenario: Consultar guia vacia
    Given que el cliente se encuentra en rastreo
    When intenta consultar sin ingresar guia
    Then deberia ver una validacion de campo obligatorio

  @discovery @legacy-rastreo @exception
  Scenario: Consultar guia con formato invalido
    Given que el cliente se encuentra en rastreo
    When consulta una guia con formato invalido
    Then deberia ver una validacion de formato
