# Contrato de datos semilla E2E - LogiTrack

## Objetivo

Definir los datos mínimos controlados que deben existir para que la suite E2E pueda automatizar flujos felices y excepcionales sin depender de datos improvisados.

## Datos semilla requeridos

| Identificador | Tipo | Uso | Estado |
|---|---|---|---|
| clienteSemilla | Usuario cliente | Login, dashboard, rastreo asociado | Pendiente |
| operadorSemilla | Usuario operador | Crear envío, actualizar eventos | Pendiente |
| adminSemilla | Usuario administrador | Gestión de usuarios y roles | Pendiente |
| guiaExistente | Guía de rastreo | Consulta feliz de rastreo | Pendiente |
| guiaEntregada | Guía de rastreo | Validar estado final | Pendiente |
| guiaEnTransito | Guía de rastreo | Validar estado intermedio | Pendiente |
| guiaInexistente | Guía negativa | Validar mensaje de no encontrada | Discovery |

## Reglas

- Ningún dato semilla debe contener secretos reales versionados.
- Las contraseñas deben referenciar variables de entorno o secrets.
- Las guías semilla deben tener estado conocido.
- Los datos semilla deben ser resistentes a múltiples ejecuciones.
- Los datos semilla no deben ser eliminados por pruebas automáticas.
- Los datos dinámicos deben poder distinguirse de los datos semilla.

## Criterios para considerar un dato como controlado

| Criterio | Obligatorio |
|---|---|
| Existe en ambiente de pruebas | Sí |
| Tiene identificador único | Sí |
| Tiene estado esperado documentado | Sí |
| No depende del orden de ejecución | Sí |
| Puede usarse en CI | Sí |
| No contiene información sensible | Sí |
