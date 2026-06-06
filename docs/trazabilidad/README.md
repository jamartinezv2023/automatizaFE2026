# Trazabilidad QA LogiTrack

Esta carpeta contiene la trazabilidad formal del proyecto de automatización.

## Archivos

| Archivo | Propósito |
|---|---|
| matriz-requisito-feature.md | Relaciona dominio y features Gherkin |
| matriz-feature-scenario.md | Relaciona features con escenarios |
| matriz-scenario-screenplay.md | Relaciona escenarios con implementación Screenplay |
| matriz-cobertura-dominio.md | Resume cobertura medible del dominio |

## Cadena de trazabilidad

```text
Dominio
  -> Requisito
  -> Feature
  -> Escenario
  -> Step Definition
  -> Task
  -> Question
  -> Reporte Serenity
