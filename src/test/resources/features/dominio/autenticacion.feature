Feature: Autenticacion de usuarios

  @happy @registro
  Scenario: Registrar cliente exitosamente
    Given que un visitante se encuentra en la pantalla de registro
    When completa el formulario con datos validos y correo unico
    Then deberia acceder al dashboard como cliente

  @exception @registro
  Scenario: Registrar cliente con correo existente
    Given que un visitante se encuentra en la pantalla de registro
    When intenta registrarse con un correo ya registrado
    Then deberia ver un mensaje indicando que el correo ya esta registrado

  @exception @registro
  Scenario: Registrar cliente con campos obligatorios vacios
    Given que un visitante se encuentra en la pantalla de registro
    When intenta enviar el formulario sin completar campos obligatorios
    Then deberia permanecer en registro y visualizar validaciones

  @blocked @login
  Scenario: Iniciar sesion con credenciales validas
    Given que un cliente registrado se encuentra en login
    When ingresa credenciales validas
    Then deberia acceder al dashboard

  @exception @login
  Scenario: Iniciar sesion con credenciales invalidas
    Given que un visitante se encuentra en login
    When ingresa credenciales invalidas
    Then deberia ver un mensaje de error de autenticacion

  @happy @logout
  Scenario: Cerrar sesion desde dashboard
    Given que un cliente autenticado se encuentra en dashboard
    When cierra la sesion
    Then deberia regresar a login
