# `var` en Java

El término **`var`** en Java hace referencia a una característica introducida en **Java 10** como parte de la mejora **Local-Variable Type Inference** (inferencia de tipo en variables locales). Esto significa que el compilador puede deducir automáticamente el tipo de una variable a partir del valor que se le asigna en el momento de la declaración.

---

## Características principales de `var`
1. **Declaración implícita del tipo**:
   En lugar de especificar explícitamente el tipo de la variable, puedes usar `var`, y el compilador lo deduce automáticamente:
   ```java
   var message = "Hola Mundo"; // El compilador deduce que es de tipo String
   var number = 42;           // El compilador deduce que es de tipo int
