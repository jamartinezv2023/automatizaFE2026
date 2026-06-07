# Checklist de datos semilla

## Antes de ejecutar suite crítica

- [ ] Existe cliente semilla.
- [ ] Existe operador semilla.
- [ ] Existe admin semilla.
- [ ] Existe guía válida.
- [ ] Existe guía entregada.
- [ ] Existe guía en tránsito.
- [ ] Secrets configurados en GitHub Actions.
- [ ] Datos no contienen información sensible.
- [ ] Datos son reutilizables.
- [ ] Datos no dependen del orden de ejecución.

## Antes de release

- [ ] Suite smoke ejecutada.
- [ ] Suite critical ejecutada.
- [ ] Datos semilla no fueron modificados.
- [ ] No hay flaky tests asociados a datos.
- [ ] Reporte Serenity generado.
- [ ] SonarCloud Quality Gate aprobado.
