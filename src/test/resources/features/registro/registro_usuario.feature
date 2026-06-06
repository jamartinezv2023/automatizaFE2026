Feature: Registro de usuarios

  Scenario: Enviar formulario de registro con datos validos
    Given que el visitante se encuentra en la pantalla de registro
    When registra un nuevo cliente
    Then deberia permanecer en el flujo de registro o autenticacion
