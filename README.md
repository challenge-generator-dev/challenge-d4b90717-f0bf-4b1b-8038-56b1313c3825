# Construcción de API REST para ordenes

Construye una API REST en Spring Boot que permita a un panel web visualizar y filtrar ordenes. La API debe manejar el estado y los errores de las ordenes. La UI debe permitir filtrar las ordenes por estado.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Panel web para consumir una API REST de ordenes |
| **Nivel** | senior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 10 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Tener el proyecto base del reto funcionando en tu máquina: clonar el repositorio, instalar las herramientas y verificar que compila y arranca antes de empezar a practicar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Instala las herramientas para ejecutar el proyecto: JDK 17+ y Maven 3.9+.
- Clona el repositorio del reto (el enlace viene en la entrega del reto y en la sección "Repositorio del Proyecto" del PDF) y ábrelo en tu IDE.
- Instala las dependencias y compila ejecutando `mvn -q -B -DskipTests -Dspring-boot.repackage.skip=true package` en la raíz del repositorio.
- Confirma que el comando termina sin errores: el proyecto arranca y sus pruebas corren.
- Ubica los archivos de práctica: son los que contienen `TODO(reto)` (búscalos en el repositorio). Lee el README.md y el AGENTS.md antes de empezar.

**Entregable:** El proyecto compila/arranca sin errores con `mvn -q -B -DskipTests -Dspring-boot.repackage.skip=true package`.

<details>
<summary>Pistas de conocimiento</summary>

- Los archivos con `TODO(reto)` son el ejercicio: el resto del repositorio ya está resuelto y no hace falta tocarlo.
- Si el comando de verificación falla, revisa la versión de las herramientas instaladas antes de modificar código.
- AGENTS.md describe el reto, el comando de verificación y las reglas del repositorio.

</details>

### Fase 1: Definición de la API

**Objetivo:** Definir los endpoints y la estructura de la API REST para las ordenes.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identifica los endpoints necesarios para visualizar y filtrar ordenes.
- Define la estructura de los datos que la API devolverá.

**Entregable:** Documento que describe los endpoints y la estructura de la API REST.

<details>
<summary>Pistas de conocimiento</summary>

- Considera los estados posibles de una orden y cómo se deben representar.
- Piensa en los posibles errores que pueden ocurrir al consumir la API y cómo manejarlos.

</details>

### Fase 2: Implementación de la API

**Objetivo:** Implementar los endpoints definidos en la fase anterior.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Crea los controladores y servicios necesarios para implementar los endpoints de la API.
- Asegura que la API maneje correctamente el estado y los errores de las ordenes.

**Entregable:** Código fuente de la API REST implementada.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza Spring Boot para crear los controladores y servicios.
- Implementa la lógica de negocio necesaria para manejar las ordenes.

</details>

### Fase 3: Pruebas y optimización

**Objetivo:** Realizar pruebas unitarias y de integración para asegurar la calidad de la API y optimizar su rendimiento.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Escribe pruebas unitarias y de integración para los endpoints de la API.
- Identifica y soluciona posibles cuellos de botella en el rendimiento de la API.

**Entregable:** Código fuente de la API con pruebas unitarias y de integración implementadas y optimizaciones aplicadas.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza frameworks de testing para escribir las pruebas.
- Analiza el rendimiento de la API y aplica optimizaciones necesarias.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es una API REST y cuáles son sus componentes principales?
- **paraQueSirve**: ¿Para qué sirve la API REST en el contexto de este reto?
- **comoSeUsa**: ¿Cómo se usa la API REST para visualizar y filtrar ordenes?
- **erroresComunes**: ¿Cuáles son los errores comunes que pueden ocurrir al consumir la API REST y cómo se manejan?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación de la API REST en términos de rendimiento y manejo de errores?

## Criterios de Evaluacion

- Definición clara de los endpoints y la estructura de la API REST.
- Implementación correcta de los endpoints de la API REST.
- Manejo adecuado del estado y los errores de las ordenes en la API REST.
- Pruebas unitarias y de integración efectivas para los endpoints de la API REST.
- Optimizaciones aplicadas para mejorar el rendimiento de la API REST.

## Como trabajar con un asistente de IA

Hay dos caminos, elegi uno:

- **AGENTS.md** (recomendado) — instrucciones nativas del repo. Abri esta carpeta con tu agente local (Claude Code, Cursor, Codex, Copilot, Gemini) y las carga solo. Sabe que archivos faltan y con que comando se verifica, y completa el scaffold escribiendo en disco.
- **PROMPT_MEJORA.md** — para copiar y pegar en un chat (claude.ai, ChatGPT) si no tenes un agente en el IDE. Declara lo mismo que AGENTS.md; los archivos que te devuelva el chat los guardas en esta carpeta respetando las rutas.

Ninguno de los dos resuelve las fases del reto: eso es tu trabajo.

## Herramientas

- **React**: Tecnologia pedida sin componente propio en este reto: el ejercicio no la construye, pero queda como contexto del pedido.

## Verificacion

El proyecto esta listo para trabajar cuando este comando corre sin errores:

```bash
mvn -q -B -DskipTests -Dspring-boot.repackage.skip=true package
```

---

*Reto generado automaticamente por Challenge Generator - Pragma*
