# Capacidad: Roles

## Objetivo

Validar diferencias funcionales entre cliente, operador y administrador.

## Caminos felices

| Escenario | Estado |
|---|---|
| Cliente accede a funcionalidades permitidas | Pendiente |
| Operador crea y actualiza envíos | Pendiente |
| Administrador gestiona usuarios o roles | Pendiente |

## Caminos excepcionales

| Escenario | Estado |
|---|---|
| Cliente intenta acceder a módulo operador | Pendiente |
| Usuario sin permisos intenta acción restringida | Pendiente |
| Rol no asignado intenta iniciar flujo protegido | Pendiente |

## Estado E2E

Pendiente.

## Dependencias

- Autenticación estable.
- Usuarios semilla por rol.
- Reglas de autorización visibles.

## Próxima acción

Definir datos semilla de usuarios por rol antes de automatizar.
