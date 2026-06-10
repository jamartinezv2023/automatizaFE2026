# Estrategia de suites E2E

## Problema

La automatización no debe depender de una única etiqueta `@stable`, porque eso impide representar la cobertura completa del dominio.

## Solución

Separar la automatización en varias suites:

## @smoke

Suite mínima crítica.

Debe contener pocos escenarios, rápidos y confiables.

## @stable

Suite confiable para regresión.

Solo incluye escenarios que cumplen FIRST.

## @domain

Suite de cobertura funcional del negocio.

Puede incluir escenarios en distintos estados, siempre que estén documentados.

## @candidate

Escenarios automatizados que están en validación.

## @blocked

Escenarios conocidos, importantes, pero no promovibles todavía.

## @discovery

Escenarios modelados o pendientes.

## Regla

No se elimina un escenario del dominio solo porque no sea estable.

Se clasifica correctamente.

## Guardia de compilación vs guardia E2E remota

A partir de v5.15.0 se separan dos tipos de validación:

| Guardia | Script | Propósito |
|---|---|---|
| Guardia de compilación | `scripts/qa/stable-compile-guard.sh` | Verifica que el framework, StepDefinitions, Tasks, Questions y Features compilan correctamente |
| Guardia E2E remota | `scripts/qa/stable-suite-check.sh` | Ejecuta escenarios contra el frontend remoto y puede fallar por disponibilidad, latencia o cambios visuales |

## Decisión

Los escenarios no se degradan automáticamente cuando falla la guardia E2E remota.

Primero se clasifica el fallo como:

1. Fallo de automatización.
2. Fallo funcional real.
3. Fallo de ambiente remoto.
4. Fallo de latencia o disponibilidad.

Solo se cambia el estado de un escenario después de diagnóstico.
