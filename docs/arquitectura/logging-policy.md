# Política de logging en pruebas E2E

## Objetivo

Evitar el uso de `System.out.println` en el framework de automatización y centralizar la salida diagnóstica mediante SLF4J.

## Regla

No se permite:

~~~java
System.out.println(...)
~~~

Se debe usar:

~~~java
private static final Logger LOGGER = LoggerFactory.getLogger(Clase.class);
LOGGER.info("Mensaje {}", valor);
~~~

## Beneficios

- Mejor mantenibilidad.
- Mejor compatibilidad con SonarCloud.
- Mejor trazabilidad en CI.
- Mejor control de salida diagnóstica.
- Alineación con buenas prácticas de Java.
