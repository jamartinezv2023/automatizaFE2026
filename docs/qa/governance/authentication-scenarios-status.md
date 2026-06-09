# Estado de escenarios de autenticación

## Suite estable actual

- Login con campos vacíos: stable.
- Login con credenciales inválidas: stable.

## Escenario bloqueado

- Acceso a ruta protegida sin autenticación.

## Decisión FIRST

El escenario de ruta protegida no se promueve porque no cumple repetibilidad e independencia dentro de la suite completa.

## Estado objetivo

Mantener únicamente en `@stable` los escenarios que:

1. Pasan aislados.
2. Pasan repetidamente.
3. Pasan dentro de la suite completa.
4. No contaminan sesión, cookies, localStorage ni sessionStorage.
5. Generan evidencia Serenity.
