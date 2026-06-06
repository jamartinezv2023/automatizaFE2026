# Definition of Done E2E

Un escenario E2E se considera terminado cuando cumple todos los siguientes puntos.

## Gherkin

- Feature clara.
- Scenario enfocado en una sola capacidad de negocio.
- Given, When, Then respetan AAA.
- Tags correctos.
- Lenguaje entendible para negocio.

## Screenplay

- Step Definition delega en Tasks y Questions.
- Task ejecuta acciones, no valida resultados finales.
- Question valida resultados, no ejecuta acciones.
- User Interface centraliza Targets.
- Selectores se basan en evidencia real del DOM.

## Ejecución

- Compila con `./gradlew clean testClasses`.
- Ejecuta en suite estable si aplica.
- Genera evidencia Serenity.
- No requiere orden de ejecución.
- No depende de otro escenario.

## Calidad

- Cumple FIRST.
- Cumple INVEST.
- Tiene trazabilidad.
- Está documentado en matrices QA.
- No introduce deuda técnica.
