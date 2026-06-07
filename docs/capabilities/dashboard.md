# Capacidad: Dashboard

## Objetivo

Validar la pantalla principal autenticada y sus accesos a módulos.

## Caminos felices

| Escenario | Estado |
|---|---|
| Visualizar dashboard de cliente | Bloqueado |
| Acceder a módulos principales | Pendiente |
| Ver resumen de envíos | Pendiente |

## Caminos excepcionales

| Escenario | Estado |
|---|---|
| Acceso sin autenticación | Pendiente |
| Sesión expirada | Pendiente |
| Error de carga de dashboard | Pendiente |

## Estado E2E

Bloqueado.

## Dependencias

- Login estable.
- Sesión persistente.
- Token/cookie correcto.

## Próxima acción

Resolver autenticación antes de automatizar dashboard.
