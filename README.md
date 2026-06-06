# automatizaFE2026

[![CI - Serenity Screenplay](https://github.com/jamartinezv2023/automatizaFE2026/actions/workflows/ci.yml/badge.svg)](https://github.com/jamartinezv2023/automatizaFE2026/actions/workflows/ci.yml)
[![SonarQube Cloud](https://github.com/jamartinezv2023/automatizaFE2026/actions/workflows/sonar.yml/badge.svg)](https://github.com/jamartinezv2023/automatizaFE2026/actions/workflows/sonar.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=jamartinezv2023_automatizaFE2026&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=jamartinezv2023_automatizaFE2026)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=jamartinezv2023_automatizaFE2026&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=jamartinezv2023_automatizaFE2026)

Proyecto de automatización E2E para el sistema LogiTrack, construido con Serenity BDD, Cucumber, Screenplay Pattern, Gradle y Java.

## Resumen ejecutivo

Este repositorio implementa una estrategia profesional de automatización E2E basada en:

- Serenity BDD
- Screenplay Pattern
- Cucumber BDD
- Java 17
- Gradle
- GitHub Actions
- SonarCloud

El objetivo no es automatizar todo de forma artificial, sino automatizar únicamente funcionalidades observables, repetibles, trazables y estables del dominio LogiTrack.

## Dashboard de calidad

| Indicador | Estado |
|---|---|
| Build local | ✅ Estable |
| Compilación Gradle | ✅ Estable |
| Suite estable | ✅ Implementada |
| Trazabilidad QA | ✅ Implementada |
| Matriz INVEST | ✅ Implementada |
| Gobierno FIRST / AAA | ✅ Documentado |
| SonarCloud | ⚠️ En estabilización |
| Cobertura funcional estable | 20% |
| Hallazgos documentados | ✅ Sí |

## Suite estable

La suite estable se ejecuta mediante:

```bash
./gradlew clean test aggregate
```

Runner principal:

```text
StableSuiteRunner
```

Filtro lógico:

```text
@stable and not @blocked and not @wip
```

Escenarios estables actuales:

| Escenario | Feature | Estado |
|---|---|---|
| Visualizar pantalla de rastreo de envíos | rastreo_guia.feature | ✅ Estable |
| Enviar formulario de registro con datos válidos | registro_usuario.feature | ✅ Parcial estable |

## Cobertura del dominio

| Área | Estado | Cobertura estable |
|---|---|---:|
| Autenticación | Parcial | 25% |
| Rastreo | Parcial | 33% |
| Envíos | Pendiente | 0% |
| Historial | Pendiente | 0% |
| Notificaciones | Pendiente | 0% |
| Total estimado | Parcial | 20% |

La cobertura estable es baja porque el sistema bajo prueba todavía no expone todos los flujos del dominio con comportamiento observable, repetible y automatizable.

## Hallazgos documentados

| Hallazgo | Estado |
|---|---|
| Login directo no redirecciona al dashboard | Documentado |
| Registro no autentica automáticamente | Documentado |
| Logout depende de sesión estable | Bloqueado |
| Ruta real de rastreo es `/rastrear` | Resuelto |
| Doble indexación SonarCloud | Resuelto |

Documentación relacionada:

```text
docs/hallazgos/
docs/dominio/
docs/trazabilidad/
docs/qa/
```

## Estrategia de ejecución

El proyecto clasifica escenarios mediante tags Cucumber:

| Tag | Uso |
|---|---|
| @stable | Escenarios deterministas y ejecutables |
| @wip | Escenarios en construcción |
| @blocked | Escenarios bloqueados por hallazgos |
| @discovery | Escenarios exploratorios |
| @happy | Camino feliz |
| @exception | Camino excepcional |

Validación rápida:

```bash
./gradlew clean testClasses
```

Validación E2E estable:

```bash
./gradlew clean test aggregate
```

## Trazabilidad QA

La trazabilidad formal se encuentra en:

```text
docs/trazabilidad/
```

Incluye:

| Archivo | Propósito |
|---|---|
| matriz-requisito-feature.md | Relaciona dominio y features Gherkin |
| matriz-feature-scenario.md | Relaciona features con escenarios |
| matriz-scenario-screenplay.md | Relaciona escenarios con implementación Screenplay |
| matriz-cobertura-dominio.md | Resume cobertura medible del dominio |

Cadena de trazabilidad:

```text
Dominio
  -> Requisito
  -> Feature
  -> Escenario
  -> Step Definition
  -> Task
  -> Question
  -> Reporte Serenity
```

## Arquitectura Screenplay

```text
Actor
  -> Task
  -> Interaction
  -> Question
  -> Assertion
```

Estructura principal:

```text
src/test/java/com/automatizacion
├── questions
├── runners
├── stepdefinitions
├── tasks
└── userinterfaces
```

## Principios aplicados

### INVEST

Cada historia candidata a automatización debe ser:

- Independiente
- Negociable
- Valiosa
- Estimable
- Pequeña
- Testeable

### FIRST

Cada escenario automatizado debe ser:

- Fast
- Independent
- Repeatable
- Self-validating
- Timely

### AAA

Cada escenario debe respetar:

```text
Given  -> Arrange
When   -> Act
Then   -> Assert
```

## Ejecución local

Compilar pruebas:

```bash
./gradlew clean testClasses
```

Ejecutar suite estable:

```bash
./gradlew clean test aggregate
```

## Reportes

Los reportes Serenity se generan en:

```text
target/site/serenity
```

Los reportes Gradle se generan en:

```text
build/reports/tests/test/index.html
```

## Roadmap

### v1.6.x

- Consolidar SonarCloud.
- Ajustar pipeline CI con suite estable.

### v1.7.x

- Explorar contrato funcional de rastreo por guía.

### v1.8.x

- Evaluar automatización de login con evidencia HTTP.

### v2.x

- Ampliar cobertura funcional cuando el dominio exponga flujos estables.

## Estado del proyecto

Este proyecto prioriza calidad, trazabilidad y estabilidad sobre cantidad de pruebas.  
La suite estable representa únicamente escenarios que cumplen criterios de automatización robusta.
