Feature: Roles y permisos
  Como sistema LogiTrack
  Quiero restringir las funcionalidades segun el rol del usuario
  Para proteger las operaciones del negocio

  @domain @remote @blocked @security @roles @happy
  Scenario: Cliente accede solo a funcionalidades permitidas
    Given que el cliente se encuentra autenticado
    When consulta el menu principal
    Then deberia visualizar solo funcionalidades permitidas para cliente

  @domain @remote @blocked @security @roles @happy
  Scenario: Operador accede a gestion de envios
    Given que el operador se encuentra autenticado
    When consulta el menu principal
    Then deberia visualizar funcionalidades de gestion logistica

  @domain @remote @blocked @security @roles @happy
  Scenario: Administrador accede a gestion de usuarios y roles
    Given que el administrador se encuentra autenticado
    When consulta el menu principal
    Then deberia visualizar funcionalidades administrativas

  @domain @remote @blocked @security @roles @exception
  Scenario: Cliente intenta acceder a funcion de operador
    Given que el cliente se encuentra autenticado
    When intenta acceder a una funcionalidad de operador
    Then el sistema deberia denegar el acceso
