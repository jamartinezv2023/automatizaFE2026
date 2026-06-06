Feature: Dominio completo LogiTrack E2E
  Como equipo QA
  Quiero modelar todos los flujos críticos del dominio LogiTrack
  Para asegurar cobertura funcional completa, trazable y gobernada

  @stable @rastreo @happy
  Scenario: Visualizar pantalla de rastreo de envios
    Given que el visitante se encuentra en la pagina principal
    When navega a la opcion de rastrear envio
    Then deberia visualizar la pantalla de rastreo

  @stable @registro @happy
  Scenario: Enviar formulario de registro con datos validos
    Given que el visitante se encuentra en la pantalla de registro
    When registra un nuevo cliente
    Then deberia permanecer en el flujo de registro o autenticacion

  @blocked @login @happy
  Scenario: Iniciar sesion con credenciales validas
    Given que el cliente se encuentra en la pantalla de inicio de sesion
    When inicia sesion con credenciales validas
    Then deberia visualizar el dashboard del cliente autenticado

  @blocked @logout @happy
  Scenario: Cerrar sesion desde dashboard
    Given que el cliente se encuentra autenticado en el dashboard
    When cierra la sesion desde el dashboard
    Then deberia visualizar nuevamente la pantalla de inicio de sesion

  @discovery @rastreo @exception
  Scenario: Consultar una guia inexistente
    Given que el visitante se encuentra en la pantalla de rastreo
    When consulta una guia inexistente
    Then deberia ver un mensaje indicando que la guia no fue encontrada

  @discovery @rastreo @happy
  Scenario: Consultar una guia existente
    Given que el visitante se encuentra en la pantalla de rastreo
    When consulta una guia existente
    Then deberia visualizar el estado actual del envio

  @discovery @envios @happy
  Scenario: Crear envio y registrar primer evento de seguimiento
    Given que un operador se encuentra autenticado
    When crea un envio con datos validos
    Then el sistema deberia generar una guia de rastreo

  @discovery @envios @exception
  Scenario: Crear envio con datos incompletos
    Given que un operador se encuentra autenticado
    When intenta crear un envio sin datos obligatorios
    Then el sistema deberia mostrar validaciones de campos requeridos

  @discovery @historial @happy
  Scenario: Consultar historial de eventos de un envio
    Given que existe un envio con eventos registrados
    When consulta el historial del envio
    Then deberia visualizar la linea de tiempo del envio

  @discovery @notificaciones @happy
  Scenario: Visualizar notificaciones asociadas a un envio
    Given que existe un envio con novedades
    When el cliente consulta sus notificaciones
    Then deberia visualizar las notificaciones disponibles
