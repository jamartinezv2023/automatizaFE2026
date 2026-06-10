Feature: Gestion de envios
  Como operador logistico
  Quiero crear y administrar envios
  Para iniciar el proceso logistico de entrega

  @blocked @critical @envios @happy
  Scenario: Crear envio con datos validos
    Given que el operador se encuentra autenticado
    When crea un envio con datos validos
    Then el sistema deberia generar una guia de rastreo

  @blocked @critical @envios @happy
  Scenario: Registrar primer evento de seguimiento
    Given que existe un envio creado
    When el operador registra el primer evento de seguimiento
    Then el envio deberia mostrar el evento inicial en el historial

  @blocked @envios @exception
  Scenario: Crear envio con datos obligatorios vacios
    Given que el operador se encuentra autenticado
    When intenta crear un envio sin completar campos obligatorios
    Then deberia visualizar validaciones de campos requeridos

  @blocked @envios @exception
  Scenario: Crear envio con destinatario invalido
    Given que el operador se encuentra autenticado
    When intenta crear un envio con destinatario invalido
    Then deberia visualizar una validacion de datos del destinatario

  @blocked @envios @exception
  Scenario: Actualizar envio inexistente
    Given que el operador se encuentra autenticado
    When intenta actualizar un envio inexistente
    Then deberia visualizar un mensaje indicando que el envio no existe
