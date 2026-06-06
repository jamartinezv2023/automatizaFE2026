# ADR-0003: Política de cobertura SonarCloud

## Contexto

El repositorio automatiza pruebas E2E con Serenity BDD, Cucumber y Screenplay.

## Decisión

La cobertura unitaria de SonarCloud no se usará como métrica principal porque el proyecto no contiene lógica productiva de aplicación, sino automatización E2E.

## Métricas principales

- Escenarios E2E ejecutados.
- Escenarios aprobados.
- Flaky tests.
- Tiempo de ejecución.
- Trazabilidad.
- Estabilidad de suite.
- Quality Gate sin issues críticos.

## Consecuencia

Se excluye el cálculo de cobertura con:

sonar.coverage.exclusions=**/*
