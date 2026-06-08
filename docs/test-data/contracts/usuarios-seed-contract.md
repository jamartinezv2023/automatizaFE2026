# Contrato de usuarios semilla

## Usuarios requeridos

| ID lógico | Rol | Email sugerido | Password | Estado |
|---|---|---|---|---|
| clienteSemilla | CLIENTE | cliente.semilla@example.test | E2E_CLIENT_PASSWORD | Pendiente |
| operadorSemilla | OPERADOR | operador.semilla@example.test | E2E_OPERATOR_PASSWORD | Pendiente |
| adminSemilla | ADMIN | admin.semilla@example.test | E2E_ADMIN_PASSWORD | Pendiente |

## Reglas

- Los passwords reales no se versionan.
- Los passwords deben estar en GitHub Actions Secrets.
- Los emails deben pertenecer a dominio de pruebas.
- Los usuarios deben estar activos.
- Los usuarios no deben ser modificados por pruebas E2E.
- Cada rol debe tener permisos coherentes con el dominio.

## Variables requeridas en CI

```text
E2E_CLIENT_EMAIL
E2E_CLIENT_PASSWORD
E2E_OPERATOR_EMAIL
E2E_OPERATOR_PASSWORD
E2E_ADMIN_EMAIL
E2E_ADMIN_PASSWORD

## 5. Contrato de guías

```bash
cat > docs/test-data/contracts/guias-seed-contract.md <<'EOF'
# Contrato de guías semilla

## Guías requeridas

| ID lógico | Estado esperado | Uso | Estado dataset |
|---|---|---|---|
| guiaExistente | Cualquier estado válido visible | Rastreo feliz | Pendiente |
| guiaEnTransito | En tránsito | Validar estado intermedio | Pendiente |
| guiaEntregada | Entregado | Validar estado final | Pendiente |
| guiaConIncidencia | Retenido/Reprogramado | Validar excepción de negocio | Pendiente |
| guiaInexistente | No encontrada | Rastreo negativo | Discovery |

## Reglas

- Las guías deben ser estables en ambiente de pruebas.
- Las guías de solo lectura no deben cambiar de estado durante la suite smoke.
- Las guías de flujo dinámico deben crearse en el mismo escenario.
- El valor real de una guía controlada debe poder configurarse fuera del código.
- Las guías compartidas no deben eliminarse automáticamente.

## Variables sugeridas

```text
E2E_TRACKING_GUIDE_EXISTING
E2E_TRACKING_GUIDE_IN_TRANSIT
E2E_TRACKING_GUIDE_DELIVERED
E2E_TRACKING_GUIDE_INCIDENT
E2E_TRACKING_GUIDE_NOT_FOUND

## 6. Contrato de ambiente

```bash
cat > docs/test-data/contracts/environment-seed-contract.md <<'EOF'
# Contrato de ambiente de pruebas

## Ambiente objetivo

| Elemento | Valor |
|---|---|
| Frontend | https://logistica-frontend-54fk.onrender.com |
| Tipo | Pruebas E2E |
| Datos reales | No |
| Datos semilla | Requeridos |
| Secrets | GitHub Actions Secrets |

## Reglas

- El ambiente debe estar disponible antes de ejecutar la suite.
- Las rutas públicas deben responder sin autenticación.
- Las rutas protegidas deben requerir sesión.
- Los datos semilla deben existir antes de ejecutar suites críticas.
- La suite estable no debe alterar el estado global del ambiente.

## Validaciones mínimas

| Validación | Estado |
|---|---|
| Home disponible | Activo |
| Registro disponible | Activo |
| Rastreo disponible | Activo |
| Login estable | Pendiente |
| Dashboard estable | Pendiente |
| API de datos semilla | Pendiente |


## Decisión v4.9.1

Los usuarios semilla permanecen pendientes. Mientras no existan credenciales reales activas, la estrategia E2E autenticada usará usuarios dinámicos creados durante la ejecución.
