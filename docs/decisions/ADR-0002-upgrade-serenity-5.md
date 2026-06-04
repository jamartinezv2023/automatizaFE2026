# ADR-0002

## Título
Migración de Serenity 3.3.4 a Serenity 5.3.10

## Estado
Aceptado

## Contexto

Se detectó incompatibilidad entre:

- Serenity 3.3.4
- Selenium 4.4.0
- Chrome 148

Las pruebas E2E fallan durante la creación del ChromeDriver.

## Evidencia

Laboratorio técnico realizado en rama feature/upgrade-serenity.

Resultado:

Serenity 5.3.10 incorpora Selenium 4.41.0.

## Decisión

Migrar el proyecto a Serenity 5.3.10.

## Consecuencias

- Compatibilidad con navegadores modernos.
- Eliminación de deuda técnica.
- Mejor soporte para CI/CD.
- Mejor integración con Selenium Manager.

