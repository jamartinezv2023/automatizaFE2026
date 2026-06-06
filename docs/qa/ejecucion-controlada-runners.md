# Ejecución controlada de runners

## Principio

Los runners estables no deben renombrarse ni eliminarse para aislar pruebas.

## Runners activos

- RegistroUsuarioRunner
- LogoutUsuarioRunner
- RastreoGuiaRunner

## Runners deshabilitados por hallazgo o legado

- LoginUsuarioRunner.java.disabled
- TrackingLogisticoRunner.java.disabled

## Reglas FIRST

- Fast: compilar con testClasses en CI.
- Independent: cada runner debe poder ejecutarse sin depender de otro.
- Repeatable: datos dinámicos para evitar colisiones.
- Self-validating: assertions claras en Questions.
- Timely: cada flujo se automatiza cerca de su definición Gherkin.

## Patrón AAA

- Arrange: Given prepara estado y navegación.
- Act: When ejecuta una sola acción de negocio.
- Assert: Then valida el resultado observable.
