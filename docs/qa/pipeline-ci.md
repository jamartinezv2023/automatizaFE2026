# Pipeline CI

## Objetivo

Definir qué valida GitHub Actions en cada cambio del repositorio.

## Validación rápida

El pipeline principal debe ejecutar:

```bash
./gradlew clean testClasses
