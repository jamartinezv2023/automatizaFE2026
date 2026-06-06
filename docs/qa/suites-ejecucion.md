# Estrategia de suites de ejecución

## Objetivo

Evitar renombrar runners y permitir ejecución controlada mediante tags Cucumber.

## Tags principales

| Tag | Uso |
|---|---|
| @stable | Escenarios deterministas y ejecutables |
| @wip | Escenarios en construcción |
| @blocked | Escenarios bloqueados por hallazgos |
| @discovery | Escenarios exploratorios |
| @happy | Camino feliz |
| @exception | Camino excepcional |

## Runner principal

`StableSuiteRunner` ejecuta:

```text
@stable and not @blocked and not @wip
