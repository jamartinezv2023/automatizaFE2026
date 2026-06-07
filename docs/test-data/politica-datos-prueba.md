# Política de datos de prueba

## Objetivo

Definir cómo se administran los datos usados por la suite E2E de LogiTrack.

## Principios

- Cada escenario debe ser independiente.
- Los datos dinámicos deben evitar colisiones.
- Los datos semilla deben estar documentados.
- Los datos sensibles no deben versionarse.
- Los escenarios no deben depender del orden de ejecución.
- Los datos bloqueados deben marcarse explícitamente.

## Tipos de datos

| Tipo | Uso | Estado |
|---|---|---|
| Dinámicos | Registro de usuarios nuevos | Activo |
| Semilla | Usuarios, guías y envíos conocidos | Pendiente |
| Temporales | Diagnóstico local | No versionar |
| Sensibles | Tokens, contraseñas reales | Prohibido versionar |

## Regla principal

La suite estable solo puede usar datos:

- generados dinámicamente;
- semilla controlados;
- no sensibles;
- repetibles;
- trazables.
