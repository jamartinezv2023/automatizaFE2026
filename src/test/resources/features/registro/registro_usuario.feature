Feature: Registro de usuarios

  Scenario: Registrar cliente correctamente
    Given que el visitante se encuentra en la pantalla de registro
    When registra un nuevo cliente
    Then deberia visualizar el panel principal del cliente
