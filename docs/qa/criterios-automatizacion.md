# Criterios de automatización E2E

## Objetivo

Establecer cuándo una historia de negocio puede pasar a automatización E2E.

## Una historia es automatizable si cumple

- Tiene valor de negocio claro.
- Está descrita en Gherkin.
- Tiene una ruta funcional disponible.
- Tiene datos controlables.
- Tiene resultado observable.
- Puede validarse sin depender de otro escenario.
- Puede repetirse sin limpiar manualmente el ambiente.
- Tiene bajo riesgo de flakiness.

## Una historia NO debe automatizarse aún si

- El flujo no existe en frontend.
- El endpoint responde de forma inconsistente.
- El resultado no es visible en UI.
- No hay datos semilla.
- Se requiere intervención manual.
- La funcionalidad aún está en descubrimiento.

## Relación con INVEST

Toda historia candidata debe ser:

- Independiente.
- Negociable.
- Valiosa.
- Estimable.
- Pequeña.
- Testeable.

Si no es testeable, no debe pasar a E2E.
