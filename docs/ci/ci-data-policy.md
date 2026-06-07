# Política de datos semilla en CI

## Objetivo

Evitar que la suite E2E dependa de datos improvisados o sensibles durante la ejecución en GitHub Actions.

## Política

Los datos semilla usados en CI deben:

- existir antes de ejecutar la suite;
- estar documentados;
- ser no sensibles;
- ser referenciados por variables o secrets;
- ser reutilizables;
- no modificarse durante pruebas smoke;
- no depender del orden de ejecución.

## Escenarios permitidos en CI

| Tipo | Permitido | Condición |
|---|---|---|
| Datos dinámicos | Sí | No deben requerir limpieza inmediata |
| Datos semilla read-only | Sí | Deben existir previamente |
| Datos sensibles hardcodeados | No | Prohibido |
| Datos locales | No | Solo desarrollo |
| Datos discovery | Parcial | No deben bloquear pipeline |

## Regla principal

La suite `@stable` solo debe contener escenarios que puedan ejecutarse sin intervención manual.
