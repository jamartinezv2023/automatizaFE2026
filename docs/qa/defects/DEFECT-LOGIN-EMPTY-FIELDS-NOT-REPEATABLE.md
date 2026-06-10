# DEFECT-LOGIN-EMPTY-FIELDS-NOT-REPEATABLE

## Resumen

El escenario de login con campos vacíos falló durante el ciclo de hardening v5.13.0.

## Evidencia

Durante la validación de repetibilidad:

- RUN 1/10: fallido.
- Error observado: SerenityManagedException at ErrorCodec.java:169.

## Decisión FIRST

No se endurece ni se promueve el escenario porque no cumple Repeatable en este ciclo.

## Estado

Permanece en el estado actual hasta diagnóstico posterior.

## Acción futura

Revisar captura Serenity, estado del DOM, disponibilidad del formulario de login, tiempo de espera y posible interferencia del navegador.
