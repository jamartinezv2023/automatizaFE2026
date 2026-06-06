# Matriz INVEST LogiTrack

| Historia | I | N | V | E | S | T | Estado |
|---|---|---|---|---|---|---|---|
| Visualizar pantalla de rastreo | Sí | Sí | Sí | Sí | Sí | Sí | Automatizada |
| Enviar formulario de registro | Sí | Sí | Sí | Sí | Sí | Parcial | Automatizada parcialmente |
| Login directo | Parcial | Sí | Sí | Sí | Sí | No | Hallazgo |
| Logout | No | Sí | Sí | Sí | Sí | No | Bloqueada por sesión |
| Consultar guía inexistente | Sí | Sí | Sí | Sí | Sí | No | Falta contrato observable |
| Consultar guía existente | Sí | Sí | Sí | No | Sí | No | Falta dato válido |
| Crear envío | Sí | Sí | Sí | No | No | No | Falta exploración |
| Ver historial | Sí | Sí | Sí | No | Sí | No | Falta dato válido |
| Ver notificaciones | Sí | Sí | Sí | No | Sí | No | Servicio inestable |

## Interpretación

- I: Independiente
- N: Negociable
- V: Valiosa
- E: Estimable
- S: Pequeña
- T: Testeable

## Regla de decisión

Solo las historias con `T = Sí` deben pasar a automatización E2E estable.
Las historias con `T = No` deben pasar primero por descubrimiento funcional.
