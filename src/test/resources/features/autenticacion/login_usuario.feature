Feature: Inicio de sesion de usuario
  Como usuario registrado de LogiTrack
  Quiero iniciar sesion en el sistema
  Para acceder a las funcionalidades protegidas segun mi rol

  @blocked @critical @login @happy
  Scenario: Iniciar sesion con credenciales validas
    Given que el usuario se encuentra en la pantalla de inicio de sesion
    When ingresa credenciales validas
    Then deberia visualizar el dashboard correspondiente a su rol

  @stable @critical @login @exception
  Scenario: Iniciar sesion con credenciales invalidas
    Given que el usuario se encuentra en la pantalla de inicio de sesion
    When ingresa credenciales invalidas
    Then deberia visualizar un mensaje de autenticacion fallida

  @stable @critical @login @exception
  Scenario: Iniciar sesion con campos vacios
    Given que el usuario se encuentra en la pantalla de inicio de sesion
    When intenta iniciar sesion sin completar credenciales
    Then deberia visualizar validaciones de campos obligatorios

  @discovery @security @login @exception
  Scenario: Acceder a una ruta protegida sin autenticacion
    Given que el visitante no tiene sesion activa
    When intenta acceder directamente a una ruta protegida
    Then deberia ser redirigido a la pantalla de inicio de sesion
