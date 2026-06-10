# DEFECT-LOGIN-INVALID-CREDENTIALS-FLAKY

## Resumen

El escenario de login con credenciales inválidas no cumple la regla de repetibilidad FIRST.

## Evidencia

Durante el ciclo v5.11.0:

- Ejecución aislada inicial: exitosa.
- Repetición 1/10: exitosa.
- Repetición 2/10: exitosa.
- Repetición 3/10: fallida.

El fallo ocurrió con:

Scenario: Iniciar sesion con credenciales invalidas

Error observado:

AssertionFailedError at ErrorTally.java:39

## Decisión FIRST

El escenario no se promueve a `@stable` porque no cumple:

- Repeatable.
- Independent.
- Stable within suite.

## Estado

@candidate @blocked @critical @login @exception

## Acción futura

Investigar comportamiento visual del frontend tras credenciales inválidas:

- Mensaje visible.
- Toast temporal.
- Tiempo de espera.
- Cambio de DOM.
- Estado residual del navegador.
