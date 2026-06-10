# DEFECT-LOGIN-EMPTY-FIELDS-REMOVED-FROM-STABLE

## Resumen

El escenario de login con campos vacíos fue removido de la suite `@stable`.

## Evidencia

Durante la reconciliación v5.14.0 la guardia `scripts/qa/stable-suite-check.sh` falló con:

Scenario: Iniciar sesion con campos vacios

Error observado:

SerenityManagedException at ErrorCodec.java:169

## Decisión FIRST

El escenario no cumple repetibilidad actual dentro de la suite estable.

## Estado

@candidate @blocked @critical @login @exception

## Acción futura

Investigar el estado real del formulario de login, tiempos de espera, carga del frontend, disponibilidad del DOM y evidencia Serenity antes de volver a promover.
