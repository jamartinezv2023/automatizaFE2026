# Riesgos de automatización

## Riesgos actuales

| ID | Riesgo | Impacto | Mitigación |
|---|---|---|---|
| RSK-001 | Ambiente Render puede tener latencia | Flakiness | Usar esperas explícitas razonables |
| RSK-002 | Login no redirecciona establemente | Bloquea dashboard | Documentar hallazgo y validar API |
| RSK-003 | Registro no autentica automáticamente | Bloquea logout desde registro | Separar registro de autenticación |
| RSK-004 | Datos de guía no controlados | Bloquea rastreo funcional | Solicitar o crear dato semilla |
| RSK-005 | Servicios de notificaciones inestables | Fallos no deterministas | Mantener fuera de suite estable |
| RSK-006 | Selectores sin data-testid | Fragilidad de UI | Usar selectores por texto/atributos reales y proponer data-testid |
| RSK-007 | Dependencia de ambiente productivo | Resultados variables | Documentar y limitar suite estable |

## Principio de mitigación

No se automatiza un flujo si su principal riesgo no puede mitigarse mediante datos, contrato funcional o resultado observable.
