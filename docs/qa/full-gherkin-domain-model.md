# Modelo Gherkin completo del dominio LogiTrack

## Objetivo

Representar todos los caminos funcionales lógicos conocidos del dominio LogiTrack mediante Gherkin gobernado por tags.

## Principios

- No todo escenario modelado se ejecuta automáticamente.
- Solo `@stable` entra a la suite estable.
- `@blocked` representa capacidad conocida pero aún no automatizable.
- `@discovery` representa comportamiento que debe explorarse antes de estabilizar.
- `@critical` marca impacto alto de negocio.
- `@exception` cubre caminos no felices.
- `@happy` cubre caminos principales.

## Criterios de entrada a @stable

Un escenario puede pasar a `@stable` solo si cumple:

- INVEST
- FIRST
- AAA
- resultado observable
- datos controlables
- independencia de orden
- estabilidad local
- estabilidad en CI
- evidencia Serenity
- trazabilidad en documentación QA

## Alineación con IEEE 730

Este modelo aporta a:

- planificación de calidad;
- control de pruebas;
- criterios de aceptación;
- trazabilidad;
- gestión de riesgos;
- verificación y validación.
