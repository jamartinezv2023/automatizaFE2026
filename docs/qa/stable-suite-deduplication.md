# Deduplicación de suite estable

## Objetivo

Evitar que Serenity ejecute dos veces el mismo escenario funcional cuando existe:

- un feature ejecutable estable;
- un feature completo de modelado del dominio.

## Decisión

Los archivos originales continúan siendo fuente ejecutable de la suite estable.

Los archivos `*_completo.feature` se mantienen como modelo del dominio y usan el tag:

```text
@modelado

## 5. Ejecutar suite estable

```bash
./gradlew clean test aggregate -Dcucumber.filter.tags="@stable"
