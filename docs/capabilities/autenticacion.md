# Capacidad: Autenticación

## Objetivo

Cubrir login, logout y sesión autenticada.

## Caminos felices

| Escenario | Estado |
|---|---|
| Login con credenciales válidas | Bloqueado |
| Acceso a dashboard autenticado | Bloqueado |
| Cierre de sesión | Bloqueado |

## Caminos excepcionales

| Escenario | Estado |
|---|---|
| Login con credenciales inválidas | Discovery |
| Login con campos vacíos | Pendiente |
| Login con correo inválido | Pendiente |
| Acceso a dashboard sin sesión | Pendiente |

## Estado E2E

Bloqueado.

## Hallazgo conocido

El login directo no redirecciona de manera estable al dashboard.

## Riesgos

- Token/cookie no persistente.
- Respuesta HTTP no validada.
- Redirección inconsistente.
- Dependencia de sesión para otros módulos.

## Próxima acción

Diagnosticar endpoint de login desde DevTools Network o mediante API antes de automatizar nuevos escenarios autenticados.
