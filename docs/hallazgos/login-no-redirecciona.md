# Hallazgo: Login no redirecciona al dashboard en automatización

## Evidencia

Durante la ejecución E2E aislada del flujo de login, el formulario acepta usuario y contraseña, el botón cambia a estado de carga, pero la URL permanece en:

https://logistica-frontend-54fk.onrender.com/login?next=%2Fdashboard

El cuerpo visible permanece en la pantalla de login y no aparece el dashboard.

## Impacto

El escenario E2E de login no puede estabilizarse hasta validar la respuesta HTTP del endpoint de autenticación.

## Estado

No bloquea el avance del scaffold porque el flujo de registro sí autentica y redirige correctamente al dashboard.

## Próxima acción recomendada

Inspeccionar en DevTools Network la petición POST de login y validar:
- Request URL
- Status Code
- Payload
- Response
- almacenamiento de token o cookie
