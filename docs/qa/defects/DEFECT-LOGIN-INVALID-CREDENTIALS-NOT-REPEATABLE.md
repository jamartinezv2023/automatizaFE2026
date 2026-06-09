# DEFECT-LOGIN-INVALID-CREDENTIALS-NOT-REPEATABLE

## Resumen

El escenario de login con credenciales inválidas no es repetible dentro de la suite @stable.

## Evidencia

La guardia de regresión detectó fallo en:

Scenario: Iniciar sesion con credenciales invalidas

El escenario no cumple FIRST en ejecución de suite completa.

## Decisión

Se revierte a:

@candidate @blocked @critical @login @exception

## Acción

No promover hasta estabilizar validación, espera o comportamiento observable del frontend.
