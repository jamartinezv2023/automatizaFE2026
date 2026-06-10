Feature: Notificaciones de envio
  Como cliente de LogiTrack
  Quiero recibir notificaciones sobre novedades de mis envios
  Para conocer cambios importantes en el proceso logistico

  @blocked @notificaciones @happy
  Scenario: Visualizar notificaciones disponibles
    Given que el cliente se encuentra autenticado
    And existen notificaciones asociadas a sus envios
    When consulta sus notificaciones
    Then deberia visualizar la lista de notificaciones disponibles

  @blocked @notificaciones @happy
  Scenario: Marcar notificacion como leida
    Given que el cliente tiene una notificacion pendiente
    When marca la notificacion como leida
    Then la notificacion deberia cambiar a estado leido

  @blocked @notificaciones @exception
  Scenario: Visualizar bandeja sin notificaciones
    Given que el cliente se encuentra autenticado
    And no tiene notificaciones disponibles
    When consulta sus notificaciones
    Then deberia visualizar un estado vacio informativo
