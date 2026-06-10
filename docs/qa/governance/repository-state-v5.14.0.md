# v5.14.0 Repository State Reconciliation

## Línea base

La rama `main` queda sincronizada con `origin/main` y protegida por la guardia de regresión `scripts/qa/stable-suite-check.sh`.

## Estado de suite

La suite `@stable` se valida antes de promover nuevos escenarios.

## Escenarios no promovidos

- Login con credenciales inválidas.
- Ruta protegida sin autenticación.
- Login con campos vacíos en ciclo de hardening.

## Decisión

No se promueven nuevos escenarios mientras no cumplan:

1. Ejecución aislada.
2. 10 ejecuciones consecutivas.
3. Ejecución dentro de suite estable.
4. Evidencia Serenity.
5. Principio FIRST.

## Regla operativa

Todo nuevo ciclo debe comenzar desde `main` limpio y sincronizado.
