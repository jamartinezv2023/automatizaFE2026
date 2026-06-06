# Backlog de automatización E2E

## Priorización

| Prioridad | ID | Historia / Escenario | Estado | Razón |
|---|---|---|---|---|
| Alta | BL-E2E-001 | Confirmar contrato de rastreo por guía | Discovery | Es el flujo público más cercano a automatización robusta |
| Alta | BL-E2E-002 | Verificar validaciones de registro | Discovery | No requiere sesión y puede generar feedback observable |
| Media | BL-E2E-003 | Diagnosticar login por API/Network | Bloqueado | Necesario para desbloquear dashboard, logout y envíos |
| Media | BL-E2E-004 | Identificar guía válida de prueba | Discovery | Requisito para rastreo funcional |
| Media | BL-E2E-005 | Explorar creación de envío | Pendiente | Alto valor de negocio, pero depende de sesión |
| Baja | BL-E2E-006 | Automatizar historial | Pendiente | Depende de guía con eventos |
| Baja | BL-E2E-007 | Automatizar notificaciones | Pendiente | Servicio previamente inestable |

## Criterio de entrada al backlog activo

Una historia pasa a backlog activo si:

- Cumple INVEST.
- Tiene DOM identificable.
- Tiene dato controlado.
- Tiene resultado observable.
- Puede ejecutarse sin intervención manual.
- No depende de otro escenario.
