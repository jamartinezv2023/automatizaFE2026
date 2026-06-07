# Capacidad: Usuarios y Registro

## Objetivo

Validar la creación inicial de usuarios cliente dentro del sistema LogiTrack.

## Caminos felices

| Escenario | Estado |
|---|---|
| Enviar formulario de registro con datos válidos | Automatizado |
| Permanecer en flujo de registro o autenticación | Automatizado |

## Caminos excepcionales

| Escenario | Estado |
|---|---|
| Registro con correo ya existente | Discovery |
| Registro con correo inválido | Pendiente |
| Registro con contraseña vacía | Pendiente |
| Registro con nombre vacío | Pendiente |

## Estado E2E

Estable parcial.

## Evidencia

- Feature: `registro_usuario.feature`
- Runner: `StableSuiteRunner`
- Tags: `@stable @registro @happy`

## Riesgos

- El sistema puede aceptar el envío pero no redireccionar.
- El feedback de error puede depender del backend.
- Algunos resultados permanecen en la misma pantalla.

## Recomendación

Antes de automatizar excepciones, inspeccionar validaciones visibles del formulario y respuestas reales del backend.
