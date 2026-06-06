# Clasificación de escenarios

## Tags oficiales

| Tag | Uso |
|---|---|
| @stable | Escenario listo para suite estable |
| @wip | Escenario en construcción |
| @blocked | Escenario bloqueado |
| @discovery | Escenario exploratorio |
| @happy | Camino feliz |
| @exception | Camino excepcional |
| @auth | Autenticación |
| @rastreo | Rastreo |
| @registro | Registro |
| @envios | Envíos |
| @historial | Historial |
| @notificaciones | Notificaciones |

## Reglas

- Todo escenario debe tener al menos un tag de estado.
- Todo escenario debe tener al menos un tag de dominio.
- Todo escenario debe indicar si es `@happy` o `@exception`.
- Solo `@stable` entra a la suite estable.
- `@blocked`, `@wip` y `@discovery` quedan fuera de la suite estable.

## Ejemplo válido

```gherkin
@stable @rastreo @happy
Scenario: Visualizar pantalla de rastreo de envios
