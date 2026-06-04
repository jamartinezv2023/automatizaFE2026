Feature: Inicio de sesion de usuario

  Scenario: Iniciar sesion como cliente registrado
    Given que el cliente se encuentra en la pantalla de inicio de sesion
    When inicia sesion con sus credenciales validas
    Then deberia visualizar el dashboard del cliente autenticado
