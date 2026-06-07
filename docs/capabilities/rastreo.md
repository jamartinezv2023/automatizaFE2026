# Capacidad: Rastreo

## Objetivo

Permitir consultar el estado de un envío mediante guía.

## Caminos felices

| Escenario | Estado |
|---|---|
| Visualizar pantalla de rastreo | Automatizado |
| Consultar guía existente | Discovery |

## Caminos excepcionales

| Escenario | Estado |
|---|---|
| Consultar guía inexistente | Discovery |
| Consultar guía vacía | Pendiente |
| Consultar guía con formato inválido | Pendiente |
| Servicio de rastreo no disponible | Pendiente |

## Estado E2E

Parcial.

## Evidencia

- Feature: `rastreo_guia.feature`
- Runner: `StableSuiteRunner`
- Tags: `@stable @rastreo @happy`

## Riesgos

- No existe aún guía semilla controlada.
- El feedback de guía inexistente no siempre es observable.
- El texto visible puede cambiar por codificación o UI.

## Próxima acción

Conseguir o generar una guía válida controlada para automatizar consulta real de estado.
