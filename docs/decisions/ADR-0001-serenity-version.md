# ADR-0001

## Título
Actualización de Serenity por incompatibilidad con Chrome moderno

## Estado
Aceptado

## Contexto

El proyecto fue creado con:

- Serenity 3.3.4
- Selenium 4.4.0
- Java 17

Durante la ejecución E2E se detectó:

- Chrome 148
- ChromeDriver 148

El framework intenta utilizar DevTools v102-v104 y genera:

- Invalid Status code 403
- Unable to establish websocket connection

## Decisión

Actualizar el stack Serenity/Selenium a una versión compatible con Chrome moderno.

## Consecuencias

Se reduce deuda técnica.
Se mejora mantenibilidad.
Se habilita CI/CD moderno.

