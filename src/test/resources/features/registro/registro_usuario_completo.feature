Feature: Registro completo de usuarios
  Como visitante de LogiTrack
  Quiero registrarme en el sistema
  Para acceder a funcionalidades de cliente

  @modelado @critical @registro @happy
  Scenario: Enviar formulario de registro con datos validos
    Given que el visitante se encuentra en la pantalla de registro
    When registra un nuevo cliente
    Then deberia permanecer en el flujo de registro o autenticacion

  @discovery @registro @exception
  Scenario: Registrar usuario con correo ya existente
    Given que el visitante se encuentra en la pantalla de registro
    When intenta registrar un cliente con correo ya existente
    Then deberia visualizar un mensaje indicando que el correo ya esta registrado

  @discovery @registro @exception
  Scenario: Registrar usuario con correo invalido
    Given que el visitante se encuentra en la pantalla de registro
    When intenta registrar un cliente con correo invalido
    Then deberia visualizar validacion de correo invalido

  @discovery @registro @exception
  Scenario: Registrar usuario con campos obligatorios vacios
    Given que el visitante se encuentra en la pantalla de registro
    When intenta registrar un cliente sin completar campos obligatorios
    Then deberia visualizar validaciones de campos requeridos
