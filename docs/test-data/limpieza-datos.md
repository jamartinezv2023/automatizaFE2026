# Limpieza de datos

## Objetivo

Evitar contaminación entre ejecuciones.

## Estrategias

| Estrategia | Aplicación |
|---|---|
| Datos dinámicos | Registro de usuarios |
| Datos semilla read-only | Rastreo, historial |
| Limpieza por API | Pendiente |
| Limpieza por BD | Pendiente |
| Expiración por fecha | Recomendado para datos temporales |

## Reglas

- No borrar datos semilla compartidos.
- Los datos generados por pruebas deben poder identificarse.
- Los datos temporales deben tener prefijo o patrón.
- La suite estable no debe depender de limpieza manual.

## Prefijos recomendados

```text
qa-
e2e-
auto-
cliente-
envio-

## 8. Datasets reutilizables

```bash
cat > docs/test-data/datasets.md <<'EOF'
# Datasets reutilizables

## Objetivo

Definir datasets que puedan reutilizarse en pruebas sin romper independencia.

## Dataset mínimo

| Dataset | Uso | Estado |
|---|---|---|
| cliente-dinamico | Registro | Activo |
| guia-valida | Rastreo feliz | Pendiente |
| guia-inexistente | Rastreo excepción | Discovery |
| operador-semilla | Crear envío | Pendiente |
| admin-semilla | Roles | Pendiente |

## Regla

Un dataset reutilizable debe ser:

- estable;
- observable;
- no sensible;
- documentado;
- compatible con CI.
