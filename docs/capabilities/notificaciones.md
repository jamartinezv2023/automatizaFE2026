# Capacidad: Notificaciones

## Objetivo

Validar la comunicación de novedades del envío al usuario.

## Caminos felices

| Escenario | Estado |
|---|---|
| Ver notificación de novedad | Pendiente |
| Marcar notificación como leída | Pendiente |

## Caminos excepcionales

| Escenario | Estado |
|---|---|
| Sin notificaciones disponibles | Pendiente |
| Error al cargar notificaciones | Pendiente |

## Estado E2E

Pendiente.

## Riesgos

- Servicio potencialmente inestable.
- Dependencia de eventos de envío.
- Dependencia de sesión autenticada.

## Próxima acción

Mantener fuera de suite estable hasta validar disponibilidad funcional.
