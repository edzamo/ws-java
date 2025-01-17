# Java y la Herencia Múltiple

En Java, **NO se soporta la herencia múltiple de clases**, pero sí se soporta la **herencia múltiple de tipo**. Esto significa que una clase no puede heredar directamente de más de una clase, pero sí puede implementar múltiples interfaces. 

## ¿Qué significa esto?

### Herencia Múltiple de Clases (No soportada)
Si una clase intentara heredar de más de una clase, podría haber conflictos, como qué método usar si las clases padre tienen métodos con el mismo nombre. Para evitar esta ambigüedad, Java **no permite la herencia múltiple de clases**.

**Ejemplo no válido:**
```java
class A {
    void display() {
        System.out.println("Clase A");
    }
}

class B {
    void display() {
        System.out.println("Clase B");
    }
}

// Esto dará error porque Java no permite herencia múltiple de clases.
class C extends A, B {
    // Conflicto: ¿qué método display() usar?
}

```

### Herencia Múltiple de Tipo (Soportada)

Java permite que una clase implemente múltiples interfaces. Esto se llama herencia múltiple de tipo, ya que las interfaces definen un "contrato" de métodos que deben implementarse, pero no tienen lógica concreta que pueda generar conflictos.

**Ejemplo válido interfaz:**
```java
interface X {
    void methodX();
}

interface Y {
    void methodY();
}

class Z implements X, Y {
    @Override
    public void methodX() {
        System.out.println("Implementación de methodX");
    }

    @Override
    public void methodY() {
        System.out.println("Implementación de methodY");
    }
}

public class Main {
    public static void main(String[] args) {
        Z obj = new Z();
        obj.methodX();
        obj.methodY();
    }
}
