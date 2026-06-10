# Mapa de cobertura E2E del dominio LogiTrack

## Objetivo

Organizar la automatización E2E por dominio funcional, separando cobertura de negocio, estabilidad técnica y estado real de madurez de cada escenario.

## Suites

| Suite | Propósito |
|---|---|
| @smoke | Núcleo mínimo crítico que debe ejecutarse siempre |
| @stable | Escenarios repetibles y confiables |
| @domain | Escenarios que representan cobertura del negocio |
| @candidate | Escenarios automatizados en evaluación |
| @blocked | Escenarios no promovibles por fallas de repetibilidad, dependencia externa o ambigüedad funcional |
| @discovery | Escenarios modelados, pendientes de automatización o priorización |

## Matriz de cobertura

| Módulo | Escenario | Tipo | Tags | Estado | Riesgo | Prioridad | Automatizado | Observación |
|---|---|---|---|---|---|---|---|---|
| Registro | Enviar formulario de registro con datos válidos | Happy path | @stable @registro @happy | Stable | Medio | Alta | Sí | Funciona como base de registro |
| Registro | Registrar usuario con campos obligatorios vacíos | Exception | @stable @registro @exception | Stable | Medio | Alta | Sí | Valida reglas mínimas del formulario |
| Registro | Registrar usuario con correo inválido | Exception | @stable @registro @exception | Stable | Medio | Alta | Sí | Valida formato de correo |
| Login | Iniciar sesión con campos vacíos | Exception | @blocked @login @exception | Blocked | Alto | Alta | Sí | No repetible en ciclo v5.14.1 |
| Login | Iniciar sesión con credenciales inválidas | Exception | @blocked @login @exception | Blocked | Alto | Alta | Sí | Flaky, falló en repetibilidad |
| Login | Acceder a ruta protegida sin autenticación | Security | @blocked @security @login | Blocked | Alto | Alta | Sí | No cumple independencia/repetibilidad |
| Rastreo | Visualizar pantalla de rastreo de envíos | Visual | @stable @rastreo | Stable | Bajo | Alta | Sí | Escenario rápido y confiable |
| Rastreo | Consultar guía inexistente | Exception | @stable @rastreo @exception | Stable | Medio | Alta | Sí | Valida mensaje de no encontrado |
| Rastreo | Consultar rastreo con campo vacío | Exception | @stable @rastreo @exception | Stable | Medio | Alta | Sí | Valida campo obligatorio |
| Rastreo | Consultar rastreo con formato inválido | Exception | @stable @rastreo @exception | Stable | Medio | Alta | Sí | Valida formato |
| Dashboard | Visualizar elementos principales del dashboard | Visual contract | @candidate @dashboard @visual | Candidate | Medio | Media | Sí | Pasó 10/10 aislado; pendiente validar suite completa |
| Flujo compuesto | Registro dinámico → login → dashboard | E2E full flow | @discovery @registro @login @dashboard | Discovery | Alto | Alta | Parcial | No atacar hasta estabilizar login |
| Logout | Cerrar sesión | Happy path | @discovery @logout | Discovery | Medio | Media | No | Futuro candidato |
| Recuperación contraseña | Olvidé mi contraseña | Exception/Recovery | @discovery @login | Discovery | Medio | Media | No | Futuro candidato |

## Decisión estratégica

La cobertura de dominio no depende únicamente de `@stable`.

Un escenario puede aportar cobertura funcional como `@domain`, `@candidate` o `@blocked`, siempre que su estado esté documentado.

## Regla de promoción

Un escenario solo pasa a `@stable` si:

1. Corre aislado.
2. Corre 10 veces consecutivas.
3. Corre dentro de la suite `@stable`.
4. No rompe CI.
5. Genera evidencia Serenity.
6. Cumple FIRST.
