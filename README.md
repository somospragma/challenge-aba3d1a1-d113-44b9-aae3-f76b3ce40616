# Desarrollo de Pruebas Unitarias con Alta Cobertura

Como parte de un equipo de desarrollo en un entorno distribuido, necesitas asegurar que el código que escribes sea robusto y confiable. Para lograrlo, debes implementar pruebas unitarias efectivas y asegurar una cobertura óptima utilizando herramientas de verificación de cobertura. El objetivo es garantizar que el código cumpla con los estándares de calidad y sea resistente a cambios futuros.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Implementación de Pruebas Unitarias: Mejores Prácticas y Herramientas |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 3-4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Identificación de Puntos de Prueba

**Objetivo:** Identificar las áreas del código que requieren pruebas unitarias.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Analiza el código existente y determina qué funcionalidades necesitan ser probadas.
- Identifica posibles puntos de fallo y áreas críticas.

**Entregable:** Lista de funcionalidades a probar y posibles puntos de fallo.

<details>
<summary>Pistas de conocimiento</summary>

- Prioriza las áreas más críticas y de mayor impacto.
- Considera la complejidad y el uso de cada funcionalidad.

</details>

### Fase 2: Escritura de Pruebas Unitarias

**Objetivo:** Escribir pruebas unitarias efectivas para las funcionalidades identificadas.

**Tiempo estimado:** 1.5 horas

**Instrucciones:**

- Escribe pruebas unitarias para cada funcionalidad identificada en la fase anterior.
- Asegura que cada prueba cubra los casos de uso más comunes y los edge cases.

**Entregable:** Conjunto de pruebas unitarias escritas y ejecutadas.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza la metodología de prueba unitaria adecuada para tu lenguaje de programación.
- Asegura que cada prueba sea independiente y pueda ejecutarse en cualquier orden.

</details>

### Fase 3: Verificación de Cobertura

**Objetivo:** Verificar la cobertura de las pruebas unitarias escritas.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Utiliza una herramienta de verificación de cobertura para medir la efectividad de tus pruebas.
- Asegura que la cobertura sea de al menos 80%.

**Entregable:** Reporte de cobertura de las pruebas unitarias.

<details>
<summary>Pistas de conocimiento</summary>

- Explora diferentes herramientas de verificación de cobertura y elige la que mejor se adapte a tu proyecto.
- Identifica áreas con baja cobertura y escribe nuevas pruebas para mejorarla.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son las pruebas unitarias y por qué son importantes?
- **paraQueSirve**: ¿Para qué sirven las herramientas de verificación de cobertura?
- **comoSeUsa**: ¿Cómo se escriben pruebas unitarias efectivas?
- **erroresComunes**: ¿Cuáles son los errores comunes al escribir pruebas unitarias?
- **queDecisionesImplica**: ¿Qué decisiones debes tomar para mejorar la cobertura de tus pruebas?

## Criterios de Evaluacion

- Identificar áreas críticas para pruebas unitarias.
- Escribir pruebas unitarias efectivas.
- Verificar y mejorar la cobertura de las pruebas unitarias.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
