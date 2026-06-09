# Política de promoción a @stable

## Objetivo

Proteger la suite estable de regresiones, falsos positivos y escenarios no repetibles.

## Regla obligatoria

Un escenario solo puede ser promovido a `@stable` si cumple:

1. Ejecuta aislado correctamente.
2. Ejecuta 10 veces consecutivas sin fallar.
3. Ejecuta dentro de la suite completa `@stable` sin romper otros escenarios.
4. Cumple FIRST:
   - Fast
   - Independent
   - Repeatable
   - Self-validating
   - Timely
5. Genera evidencia en Serenity BDD.
6. No depende de estado residual del navegador.
7. No depende de datos externos no controlados.

## Estados permitidos

- `@stable`: escenario confiable dentro de la suite completa.
- `@candidate`: escenario automatizado en evaluación.
- `@blocked`: escenario no promovible por defecto funcional, dependencia externa o falta de repetibilidad.
- `@discovery`: escenario modelado, no automatizado o no priorizado.

## Regla de reversión

Si un escenario promovido falla dentro de la suite completa, se revierte inmediatamente a `@candidate @blocked` y se documenta el defecto.

## Prohibición

No se permite promover escenarios a `@stable` únicamente porque pasaron aislados.
