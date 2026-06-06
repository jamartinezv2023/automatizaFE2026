# Matriz de cobertura del dominio

| Área | Casos identificados | Automatizados | Bloqueados | Discovery | Pendientes | Cobertura estable |
|---|---:|---:|---:|---:|---:|---:|
| Autenticación | 4 | 1 | 2 | 0 | 1 | 25% |
| Rastreo | 3 | 1 | 0 | 2 | 0 | 33% |
| Envíos | 1 | 0 | 0 | 1 | 0 | 0% |
| Historial | 1 | 0 | 0 | 1 | 0 | 0% |
| Notificaciones | 1 | 0 | 0 | 1 | 0 | 0% |
| Total | 10 | 2 | 2 | 4 | 2 | 20% |

## Interpretación

La cobertura estable actual es baja porque el sistema bajo prueba no expone aún todos los flujos de negocio con comportamiento observable y repetible.

## Regla de avance

Una historia pasa de `Discovery` a `Automatizable` solo cuando:

- Existe ruta estable.
- Existe DOM identificable.
- Existe dato controlado.
- Existe resultado observable.
- Cumple AAA.
- Cumple FIRST.
- Cumple INVEST.
