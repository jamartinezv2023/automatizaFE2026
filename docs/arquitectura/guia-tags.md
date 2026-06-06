# Guía de tags Cucumber

## Tags de estado

| Tag | Significado |
|---|---|
| @stable | Ejecutable en suite estable |
| @wip | En construcción |
| @blocked | Bloqueado |
| @discovery | Exploratorio |

## Tags de dominio

| Tag | Dominio |
|---|---|
| @registro | Registro |
| @login | Login |
| @logout | Logout |
| @rastreo | Rastreo |
| @envios | Envíos |
| @historial | Historial |
| @notificaciones | Notificaciones |

## Tags de tipo

| Tag | Tipo |
|---|---|
| @happy | Camino feliz |
| @exception | Camino excepcional |

## Reglas

- Todo escenario debe tener un tag de estado.
- Todo escenario debe tener un tag de dominio.
- Todo escenario debe tener un tag de tipo.
- Solo 
