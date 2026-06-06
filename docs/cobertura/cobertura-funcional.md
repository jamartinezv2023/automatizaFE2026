# Cobertura funcional del dominio LogiTrack

## Objetivo

Medir qué porcentaje del dominio funcional identificado está documentado, automatizado, bloqueado o pendiente de descubrimiento.

## Mapa funcional

| Área | Funcionalidad | Estado funcional | Estado QA |
|---|---|---|---|
| Autenticación | Registro de cliente | Disponible parcialmente | Automatizado parcial |
| Autenticación | Login de cliente | Disponible pero inestable | Bloqueado |
| Autenticación | Logout | Depende de sesión estable | Bloqueado |
| Rastreo | Visualizar pantalla de rastreo | Disponible | Automatizado |
| Rastreo | Consultar guía existente | No validado | Discovery |
| Rastreo | Consultar guía inexistente | Sin feedback observable | Discovery |
| Envíos | Crear envío | No explorado completamente | Pendiente |
| Historial | Ver historial de envío | No explorado completamente | Pendiente |
| Notificaciones | Ver notificaciones | Servicio previamente inestable | Pendiente |

## Métricas funcionales

| Métrica | Valor |
|---|---:|
| Funcionalidades identificadas | 9 |
| Funcionalidades automatizadas | 1 |
| Funcionalidades parcialmente automatizadas | 1 |
| Funcionalidades bloqueadas | 2 |
| Funcionalidades en discovery | 2 |
| Funcionalidades pendientes | 3 |

## Porcentajes

| Indicador | Porcentaje |
|---|---:|
| Cobertura estable completa | 11% |
| Cobertura parcial incluyendo registro | 22% |
| Bloqueo funcional | 22% |
| Discovery requerido | 22% |
| Pendiente de exploración | 33% |

## Interpretación

La cobertura funcional estable es baja porque el sistema bajo prueba aún no expone todos los flujos con comportamiento observable, repetible y controlable.
