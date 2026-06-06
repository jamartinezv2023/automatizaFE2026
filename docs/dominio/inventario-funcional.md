# Inventario funcional LogiTrack

## Módulos visibles

| Módulo | Evidencia observada | Estado automatización |
|---|---|---|
| Inicio | Página principal disponible | Parcial |
| Registro | Formulario de creación de cuenta | Parcial |
| Login | Formulario de ingreso | Hallazgo |
| Rastreo | Página /rastrear disponible | Automatizado |
| Dashboard | Visible después de algunos flujos previos | Inestable |
| Logout | Depende de sesión autenticada | Inestable |
| Envíos | No validado todavía | Pendiente |
| Historial | No validado todavía | Pendiente |
| Notificaciones | Con hallazgos previos de servicio/CORS | Pendiente |

## Hallazgos

- El registro no autentica automáticamente.
- El login directo no redirecciona de forma estable al dashboard.
- Logout no debe depender del registro.
- La ruta real de rastreo es `/rastrear`, no `/rastreo`.

## Criterio de automatización

Un flujo solo se automatiza como E2E estable si:
- La ruta existe.
- El DOM es identificable.
- El resultado observable es estable.
- El escenario cumple AAA.
- El escenario cumple FIRST.
- La historia cumple INVEST.
