# DEFECT-PROTECTED-ROUTE-NOT-REPEATABLE

## Resumen

El escenario de acceso a ruta protegida sin autenticación no es repetible.

## Evidencia

El escenario llegó a pasar aislado varias veces, pero volvió a fallar en una nueva rama incluso después de compilar correctamente.

## Decisión FIRST

No cumple Repeatable ni Independent.

## Estado

@blocked @security @login @exception

## Acción

No promover a @stable hasta identificar el comportamiento real del frontend al acceder directamente a /dashboard sin sesión.
