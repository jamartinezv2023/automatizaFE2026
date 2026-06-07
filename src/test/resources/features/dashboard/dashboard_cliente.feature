Feature: Dashboard de cliente
  Como cliente autenticado
  Quiero visualizar mi dashboard
  Para acceder rapidamente a mis funcionalidades principales

  @blocked @dashboard @happy
  Scenario: Visualizar dashboard de cliente autenticado
    Given que el cliente se encuentra autenticado
    When accede al dashboard
    Then deberia visualizar el resumen de sus envios

  @blocked @dashboard @happy
  Scenario: Navegar desde dashboard a rastreo
    Given que el cliente se encuentra en el dashboard
    When selecciona la opcion de rastreo
    Then deberia visualizar la pantalla de rastreo

  @blocked @dashboard @exception
  Scenario: Visualizar dashboard sin informacion disponible
    Given que el cliente se encuentra autenticado
    And no tiene envios registrados
    When accede al dashboard
    Then deberia visualizar un estado vacio informativo
