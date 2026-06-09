# DEFECT-PROTECTED-ROUTE-SUITE-INTERFERENCE

## Resumen

El escenario de acceso a ruta protegida sin autenticación pasa aislado, pero falla al ejecutarse dentro de la suite @stable completa.

## Evidencia

- Ejecución aislada @candidate @security @login: 10/10 exitosa.
- Ejecución dentro de @stable: falla con AssertionFailedError.

## Decisión FIRST

El escenario NO se promueve a @stable porque no cumple independencia dentro de la suite completa.

## Estado

@candidate @blocked @security @login @exception

## Acción siguiente

Investigar contaminación de sesión, cookies, localStorage o estado compartido entre escenarios antes de promover.
