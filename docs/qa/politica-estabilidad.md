# Política de estabilidad E2E

## Objetivo

Definir cuándo un escenario puede considerarse estable dentro del framework de automatización LogiTrack.

## Estados permitidos

| Estado | Significado |
|---|---|
| Stable | Escenario automatizado, repetible y confiable |
| WIP | Escenario en construcción |
| Blocked | Escenario bloqueado por hallazgo funcional o técnico |
| Discovery | Escenario en exploración funcional |
| Deprecated | Escenario obsoleto o reemplazado |

## Criterios para marcar `@stable`

Un escenario solo puede tener `@stable` si cumple:

- Ruta funcional disponible.
- DOM identificable.
- Datos controlados o generados dinámicamente.
- Resultado observable.
- Aserción clara.
- Independencia frente a otros escenarios.
- Repetibilidad.
- Tiempo de ejecución razonable.
- Evidencia en Serenity.

## Criterios para marcar `@blocked`

Un escenario debe marcarse como `@blocked` si:

- Depende de una funcionalidad no disponible.
- Depende de datos no controlados.
- Requiere intervención manual.
- El backend o frontend no produce respuesta estable.
- No existe resultado observable verificable.

## Regla principal

Ningún escenario bloqueado, WIP o discovery debe formar parte de la suite estable.
