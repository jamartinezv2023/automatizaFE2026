# automatizaFE2026

[![CI - Serenity Screenplay](https://github.com/jamartinezv2023/automatizaFE2026/actions/workflows/ci.yml/badge.svg)](https://github.com/jamartinezv2023/automatizaFE2026/actions/workflows/ci.yml)
[![SonarQube Cloud](https://github.com/jamartinezv2023/automatizaFE2026/actions/workflows/sonar.yml/badge.svg)](https://github.com/jamartinezv2023/automatizaFE2026/actions/workflows/sonar.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=jamartinezv2023_automatizaFE2026&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=jamartinezv2023_automatizaFE2026)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=jamartinezv2023_automatizaFE2026&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=jamartinezv2023_automatizaFE2026)

Proyecto de automatización E2E para el sistema LogiTrack, construido con Serenity BDD, Cucumber, Screenplay Pattern, Gradle y Java.

## Objetivo

Validar flujos críticos del sistema de tracking logístico mediante pruebas E2E mantenibles, trazables y ejecutables dentro de una estrategia profesional de aseguramiento de calidad.

## Stack

- Java 17
- Gradle Wrapper
- Serenity BDD
- Cucumber
- Screenplay Pattern
- JUnit
- GitHub Actions
- SonarQube Cloud

## Flujos E2E implementados

- Registro de cliente
- Dashboard cliente
- Cierre de sesión desde dashboard

## Hallazgos documentados

- Login directo no redirecciona al dashboard en automatización.
- Ver: `docs/hallazgos/login-no-redirecciona.md`

## Ejecución local

Compilar pruebas:

```bash
./gradlew clean testClasses
```

Ejecutar pruebas activas:

```bash
./gradlew clean test aggregate
```

## Reportes

Cuando se ejecutan pruebas E2E con Serenity, los reportes se generan en:

```text
target/site/serenity
```

## Calidad

El proyecto usa SonarQube Cloud para análisis estático, Quality Gate y seguimiento de seguridad.

## Estructura principal

```text
src/test/java/com/automatizacion
├── questions
├── runners
├── stepdefinitions
├── tasks
└── userinterfaces
```

## Convenciones

Este proyecto sigue:

- Screenplay Pattern
- BDD con Gherkin
- Principios FIRST
- Patrón AAA
- Estrategia de pruebas basada en Pirámide de Cohn
- Documentación de calidad alineada con IEEE 730
