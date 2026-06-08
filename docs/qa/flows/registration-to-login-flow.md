# Flujo E2E: Registro a Login

## Objetivo

Automatizar el flujo completo de usuario final desde registro dinámico hasta acceso autenticado.

## Escenario objetivo

Scenario: Registrar cliente e iniciar sesion con el usuario creado
  Given que el visitante se encuentra en la pantalla de registro
  When registra un nuevo cliente para autenticacion
  And inicia sesion con el cliente registrado
  Then deberia visualizar el dashboard del cliente autenticado

## Criterios

- Usuario dinámico por UUID.
- Contraseña controlada.
- Reutilización inmediata para login.
- Validación observable del dashboard.
- Independencia de usuarios semilla.
