Feature: Cierre de sesion

  Scenario: Cerrar sesion despues de registrar cliente
    Given que el cliente se registro exitosamente
    When cierra la sesion desde el dashboard
    Then deberia visualizar nuevamente la pantalla de inicio de sesion
