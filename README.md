# 🎬 Proyecto POO: Sistema de Contenidos Audiovisuales

## 📌 Descripción y Objetivos del Proyecto
Este proyecto es una ampliación de un sistema de gestión de catálogo multimedia desarrollado en **Java**. El objetivo principal es aplicar conceptos avanzados de la **Programación Orientada a Objetos (POO)**, específicamente la **Herencia**, el **Polimorfismo** y las relaciones de **Agregación** utilizando colecciones dinámicas. 

El sistema resuelve el problema de modelar de forma realista entidades del mundo real, permitiendo que un contenido audiovisual (como una Película o un Podcast) posea y administre una lista de entidades secundarias (Actores, Locutores, etc.) con vida independiente.

## 🏗️ Clases y Funcionalidades Nuevas Añadidas
Partiendo de una clase abstracta base (`ContenidoAudiovisual`), el dominio original fue expandido significativamente.

**1. Clases de Entidad (Requisito Obligatorio):**
* `Actor`: Relacionado por agregación a `Pelicula`.
* `Temporada`: Relacionado por agregación a `SerieDeTV`.
* `Investigador`: Relacionado por agregación a `Documental`.

**2. Expansión del Proyecto (Iniciativa Propia):**
* `Anime` y `Personaje`: Nueva subclase de contenido que integra una lista de objetos `Personaje` (ej. Nombre, Poder).
* `Podcast` y `Locutor`: Nueva subclase orientada a audio que integra una lista de objetos `Locutor` (ej. Nombre, Nacionalidad).

## 🚀 Mejoras Adicionales Implementadas
* **Colecciones Dinámicas:** Se reemplazaron las asociaciones estáticas por `java.util.ArrayList` en todas las subclases, permitiendo agregar múltiples entidades (ej. varios actores a una película).
* **Refactorización de Código:** Se corrigieron los errores de la plantilla original, como la salida por consola duplicada que imprimía *"Detalles de la película"* en los documentales.
* **Polimorfismo:** En la clase ejecutable (`PruebaAudioVisual.java`) se creó un arreglo de la superclase abstracta con 5 posiciones, demostrando el enlace dinámico en tiempo de ejecución mediante un bucle `for-each`.

## 📁 Estructura de Carpetas
```text
📦 poo_unidad2_RelacionEntreClases
 ┣ 📂 src
 ┃ ┣ 📂 uni1a        # Clases de dominio (ContenidoAudiovisual, Pelicula, Anime, Actor, etc.)
 ┃ ┗ 📂 poo          # Clase principal ejecutable (PruebaAudioVisual.java)
 ┗ 📜 README.md      # Documentación principal del proyecto
