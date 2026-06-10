Feature: Gestion de envios logisticos

  @happy @envios
  Scenario: Crear envio logistico exitosamente
    Given que un cliente autenticado se encuentra en el dashboard
    When registra un nuevo envio con datos validos
    Then deberia ver la guia generada del envio

  @exception @envios
  Scenario: Crear envio sin destinatario
    Given que un cliente autenticado se encuentra en creacion de envio
    When intenta crear un envio sin destinatario
    Then deberia ver una validacion de destinatario obligatorio

  @exception @envios
  Scenario: Crear envio sin direccion de destino
    Given que un cliente autenticado se encuentra en creacion de envio
    When intenta crear un envio sin direccion de destino
    Then deberia ver una validacion de direccion obligatoria

  @exception @envios
  Scenario: Crear envio con datos incompletos
    Given que un cliente autenticado se encuentra en creacion de envio
    When intenta crear un envio con informacion incompleta
    Then el sistema no deberia crear la guia
