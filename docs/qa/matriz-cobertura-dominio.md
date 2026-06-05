# Matriz de cobertura del dominio LogiTrack

## Módulos del negocio

| Módulo | Camino feliz | Caminos excepcionales | Estado |
|---|---|---|---|
| Registro | Cliente se registra y accede al dashboard | Correo ya registrado, campos vacíos, contraseña inválida | Parcial |
| Login | Cliente autenticado accede al dashboard | Credenciales inválidas, usuario inexistente, error backend | Hallazgo |
| Logout | Cliente cierra sesión | Sesión expirada, botón no disponible | Parcial |
| Envíos | Crear envío | Datos incompletos, destinatario inválido, dirección inválida | Pendiente |
| Rastreo | Consultar guía existente | Guía inexistente, guía vacía, formato inválido | Pendiente |
| Historial | Ver eventos del envío | Envío sin historial, error de servicio | Pendiente |
| Notificaciones | Ver notificaciones del ciclo de vida | CORS/API caída, sin notificaciones | Pendiente |

## Criterio de avance

Primero se documenta el comportamiento esperado en Gherkin.
Luego se automatiza por módulos pequeños y estables.
