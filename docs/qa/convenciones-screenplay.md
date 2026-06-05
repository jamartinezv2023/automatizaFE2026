# Convenciones Screenplay

## Paquetes
- runners: ejecutores Cucumber
- stepdefinitions: conexión Gherkin con Tasks y Questions
- tasks: acciones de usuario
- questions: validaciones observables
- userinterfaces: Page Objects con Targets

## Reglas
- Una Task no debe validar resultados finales.
- Una Question no debe ejecutar acciones.
- Los locators deben basarse en evidencia real del DOM.
- Cada flujo debe poder ejecutarse aislado.
