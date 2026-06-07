# Business Capability Map - LogiTrack

## Objetivo

Mapear las capacidades funcionales del dominio LogiTrack y clasificar su cobertura E2E según caminos felices, caminos excepcionales, trazabilidad y estado de automatización.

## Matriz general

| Capacidad | Happy | Excepciones | E2E | Estado |
|---|---:|---:|---:|---|
| Registro | ✅ | ⚠️ | ✅ | Estable parcial |
| Login | ❌ | ❌ | ❌ | Bloqueado |
| Logout | ❌ | ❌ | ❌ | Bloqueado |
| Rastreo | ✅ | ⚠️ | ✅ | Parcial |
| Crear envío | ❌ | ❌ | ❌ | Pendiente |
| Historial | ❌ | ❌ | ❌ | Pendiente |
| Notificaciones | ❌ | ❌ | ❌ | Pendiente |
| Dashboard | ❌ | ❌ | ❌ | Pendiente |
| Roles | ❌ | ❌ | ❌ | Pendiente |

## Leyenda

| Símbolo | Significado |
|---|---|
| ✅ | Cubierto o automatizado |
| ⚠️ | Parcial, discovery o dependiente del producto |
| ❌ | No cubierto todavía |

## Indicadores actuales

| Indicador | Valor |
|---|---:|
| Capacidades identificadas | 9 |
| Capacidades con cobertura E2E estable | 2 |
| Capacidades parciales | 2 |
| Capacidades bloqueadas | 2 |
| Capacidades pendientes | 5 |

## Próxima decisión

El siguiente incremento de mayor valor debe elegirse según:

- Riesgo de negocio.
- Disponibilidad funcional.
- Observabilidad del resultado.
- Datos controlables.
- Cumplimiento INVEST.
- Estabilidad bajo FIRST.
