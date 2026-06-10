Feature: Historial de envio
  Como cliente u operador
  Quiero visualizar los eventos de un envio
  Para conocer su trazabilidad logistica

  @blocked @historial @happy
  Scenario: Visualizar historial de envio con eventos
    Given que existe un envio con eventos registrados
    When consulta el historial del envio
    Then deberia visualizar la linea de tiempo del envio

  @blocked @historial @exception
  Scenario: Visualizar historial de envio sin eventos
    Given que existe un envio sin eventos registrados
    When consulta el historial del envio
    Then deberia visualizar un estado vacio informativo

  @blocked @historial @exception
  Scenario: Consultar historial de envio inexistente
    Given que el usuario se encuentra autorizado
    When consulta el historial de un envio inexistente
    Then deberia visualizar un mensaje indicando que el envio no existe
