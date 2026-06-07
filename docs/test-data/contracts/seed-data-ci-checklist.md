# Checklist CI para datos semilla

Antes de mover un escenario a `@stable`, validar:

- [ ] El dato semilla existe en ambiente E2E.
- [ ] El dato no contiene información sensible.
- [ ] El dato puede ejecutarse desde GitHub Actions.
- [ ] El dato no cambia de estado durante la suite smoke.
- [ ] El resultado esperado es observable en UI.
- [ ] El escenario no depende del orden de ejecución.
- [ ] Los secrets requeridos existen.
- [ ] El escenario pasa localmente.
- [ ] El escenario pasa en GitHub Actions.
- [ ] El escenario aparece correctamente en Serenity.
