# Cobertura E2E

## Suite estable actual

| ID | Escenario | Estado | Runner |
|---|---|---|---|
| E2E-RAS-001 | Visualizar pantalla de rastreo de envíos | Estable | StableSuiteRunner |
| E2E-AUT-001 | Enviar formulario de registro con datos válidos | Parcial estable | StableSuiteRunner |

## Escenarios bloqueados

| ID | Escenario | Motivo |
|---|---|---|
| E2E-AUT-002 | Login con credenciales válidas | No redirecciona de forma estable al dashboard |
| E2E-AUT-003 | Logout desde dashboard | Depende de autenticación estable |

## Escenarios discovery

| ID | Escenario | Condición para avanzar |
|---|---|---|
| E2E-RAS-002 | Consultar guía existente | Obtener guía válida y resultado observable |
| E2E-RAS-003 | Consultar guía inexistente | Identificar feedback visible o respuesta API |
| E2E-ENV-001 | Crear envío | Confirmar formulario, datos requeridos y resultado |
| E2E-HIS-001 | Ver historial | Contar con envío con eventos |
| E2E-NOT-001 | Ver notificaciones | Confirmar servicio estable |

## Indicadores E2E

| Indicador | Valor |
|---|---:|
| Escenarios E2E identificados | 9 |
| Escenarios estables | 1 |
| Escenarios parciales estables | 1 |
| Escenarios bloqueados | 2 |
| Escenarios discovery | 5 |

## Conclusión

La suite estable actual es pequeña pero gobernada. No se recomienda aumentar cantidad de pruebas sin confirmar primero contratos funcionales.
