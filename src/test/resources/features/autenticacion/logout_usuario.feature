Feature: Cierre de sesion de usuario
  Como usuario autenticado
  Quiero cerrar mi sesion
  Para proteger el acceso a mi informacion

  @blocked @critical @logout @happy
  Scenario: Cerrar sesion desde dashboard
    Given que el usuario se encuentra autenticado en el dashboard
    When cierra la sesion
    Then deberia visualizar nuevamente la pantalla de inicio de sesion

  @discovery @logout @exception
  Scenario: Intentar volver al dashboard despues de cerrar sesion
    Given que el usuario ha cerrado sesion
    When intenta volver al dashboard usando el historial del navegador
    Then el sistema no deberia permitir el acceso a informacion protegida
