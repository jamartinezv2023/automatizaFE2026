# Estrategia de ejecución E2E

## Objetivo

Definir cómo se ejecutan las pruebas automatizadas del proyecto LogiTrack sin comprometer estabilidad, trazabilidad ni mantenibilidad.

## Suite principal

La suite oficial estable se ejecuta mediante:

```bash
./gradlew clean test aggregate
