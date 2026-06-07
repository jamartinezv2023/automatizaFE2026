# Contrato de Secrets E2E para GitHub Actions

## Objetivo

Definir los secrets necesarios para habilitar escenarios E2E autenticados, datos semilla y consultas de rastreo real en CI/CD.

## Secrets requeridos

| Secret | Uso | Estado |
|---|---|---|
| E2E_CLIENT_EMAIL | Usuario cliente semilla | Pendiente |
| E2E_CLIENT_PASSWORD | Contraseña cliente semilla | Pendiente |
| E2E_OPERATOR_EMAIL | Usuario operador semilla | Pendiente |
| E2E_OPERATOR_PASSWORD | Contraseña operador semilla | Pendiente |
| E2E_ADMIN_EMAIL | Usuario administrador semilla | Pendiente |
| E2E_ADMIN_PASSWORD | Contraseña administrador semilla | Pendiente |
| E2E_TRACKING_GUIDE_EXISTING | Guía existente controlada | Pendiente |
| E2E_TRACKING_GUIDE_IN_TRANSIT | Guía en tránsito | Pendiente |
| E2E_TRACKING_GUIDE_DELIVERED | Guía entregada | Pendiente |
| E2E_TRACKING_GUIDE_NOT_FOUND | Guía inexistente controlada | Discovery |

## Reglas

- Ningún secret debe versionarse.
- Ningún password real debe estar en archivos `.feature`, `.java`, `.json` o `.md`.
- Los secrets se administran desde GitHub Settings > Secrets and variables > Actions.
- Los escenarios dependientes de secrets no deben entrar a `@stable` hasta validar disponibilidad.
- Si un secret no existe, el escenario debe permanecer como `@blocked` o `@discovery`.

## Relación con suites

| Suite | Usa secrets | Bloquea CI |
|---|---|---|
| @smoke | No necesariamente | Sí |
| @stable | Solo si están validados | Sí |
| @critical | Sí | Sí |
| @discovery | Puede usarlos | No |
| @blocked | No ejecuta | No |
