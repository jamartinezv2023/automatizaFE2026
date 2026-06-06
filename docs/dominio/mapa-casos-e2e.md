# Mapa de casos E2E LogiTrack

## Épica: Autenticación

### Registro

| Caso | Tipo | Estado | Observación |
|---|---|---|---|
| Enviar registro con datos válidos | Feliz | Parcial | El sistema permanece en registro mostrando "Creando cuenta..." |
| Registro con correo existente | Excepcional | Pendiente | Requiere dato semilla o API |
| Registro con campos vacíos | Excepcional | Pendiente | Se puede automatizar con validaciones HTML |
| Registro con contraseña inválida | Excepcional | Pendiente | Requiere conocer reglas de validación |

### Login

| Caso | Tipo | Estado | Observación |
|---|---|---|---|
| Login con credenciales válidas | Feliz | Hallazgo | No redirecciona de forma estable |
| Login con credenciales inválidas | Excepcional | Pendiente | Falta mensaje observable |
| Login con usuario inexistente | Excepcional | Pendiente | Falta mensaje observable |

### Logout

| Caso | Tipo | Estado | Observación |
|---|---|---|---|
| Cerrar sesión autenticado | Feliz | Bloqueado | Requiere sesión estable |
| Intentar acceder a dashboard sin sesión | Excepcional | Pendiente | Puede ser buen candidato futuro |

## Épica: Rastreo

| Caso | Tipo | Estado | Observación |
|---|---|---|---|
| Visualizar pantalla de rastreo | Feliz | Automatizado | Ruta real: /rastrear |
| Consultar guía existente | Feliz | Pendiente | Requiere guía válida |
| Consultar guía inexistente | Excepcional | Pendiente | No hay mensaje observable todavía |
| Consultar sin guía | Excepcional | Pendiente | Candidato viable si hay input validable |

## Épica: Envíos

| Caso | Tipo | Estado | Observación |
|---|---|---|---|
| Crear envío válido | Feliz | Pendiente | Requiere sesión y formulario |
| Crear envío sin destinatario | Excepcional | Pendiente | Requiere conocer DOM |
| Crear envío sin dirección | Excepcional | Pendiente | Requiere conocer DOM |
| Crear envío con datos incompletos | Excepcional | Pendiente | Requiere conocer reglas |

## Épica: Historial y notificaciones

| Caso | Tipo | Estado | Observación |
|---|---|---|---|
| Ver historial de envío | Feliz | Pendiente | Requiere guía con eventos |
| Envío sin historial | Excepcional | Pendiente | Requiere dato controlado |
| Ver notificaciones | Feliz | Pendiente | Servicio reportó inestabilidad |
| Servicio de notificaciones caído | Excepcional | Pendiente | Candidato a prueba de resiliencia |
