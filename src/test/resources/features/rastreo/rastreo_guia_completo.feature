Feature: Rastreo completo de envios por guia
  Como cliente o visitante
  Quiero consultar el estado de un envio por guia
  Para conocer el avance logistico de mi paquete

  @modelado @critical @rastreo @happy
  Scenario: Visualizar pantalla de rastreo de envios
    Given que el visitante se encuentra en la pagina principal
    When navega a la opcion de rastrear envio
    Then deberia visualizar la pantalla de rastreo

  @discovery @critical @rastreo @happy
  Scenario: Consultar guia existente
    Given que el visitante se encuentra en la pantalla de rastreo
    When consulta una guia existente
    Then deberia visualizar el estado actual del envio

  @discovery @rastreo @exception
  Scenario: Consultar guia inexistente
    Given que el visitante se encuentra en la pantalla de rastreo
    When consulta una guia inexistente
    Then deberia ver un mensaje indicando que la guia no fue encontrada

  @stable @critical @rastreo @exception
  Scenario: Consultar rastreo con campo vacio
    Given que el visitante se encuentra en la pantalla de rastreo
    When intenta consultar rastreo sin ingresar guia
    Then deberia visualizar validacion de campo obligatorio

  @stable @critical @rastreo @exception
  Scenario: Consultar rastreo con formato invalido
    Given que el visitante se encuentra en la pantalla de rastreo
    When consulta una guia con formato invalido
    Then deberia visualizar validacion de formato de guia
