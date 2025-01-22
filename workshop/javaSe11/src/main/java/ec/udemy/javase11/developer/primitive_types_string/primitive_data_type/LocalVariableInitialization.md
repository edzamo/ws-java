# Local Variable Initialization

La inicialización parcial de una variable local es un error de compilación.

## Ejemplos de inicialización parcial:

- **Inicialización en un bloque `if` sin un bloque `else` correspondiente.**
- **Inicialización en una sentencia `switch` pero no en un bloque `default`.**
- **Inicialización en un bucle `while`.**
    - Nota: Un bucle `do/while` siempre se ejecuta al menos una vez, por lo que en este caso está permitido.

# Local Variable Initialization

| **Type of Initialization or Assignment**                                                                                                  | **Example**                                                                                                                                                                                                                  | **Notes**                                                                                   |
|-------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------|
| **To a Literal as described in the previous section**                                                                                     | `int i1 = 10;` // decimal integer <br> `int i2 = 012;` // octal <br> `int i3 = 0xA;` // Hexadecimal <br> `int i4 = 0b00001010;` // binary                                                                                    | All of these set the decimal representation of 10 to an `int` primitive data type.          |
| **To a variable of same data type**                                                                                                       | `int i1 = 10;` <br> `int i2 = i1;` // Assigned to another `int` variable.                                                                                                                                                    |                                                                                             |
| **To a variable of smaller data type**                                                                                                    | `short s1 = 10;` <br> `int i2 = s1;` // Assigned to a smaller primitive data variable, in this case short.                                                                                                                  |                                                                                             |
| **To a wrapper class which will automatically do casting (auto un-boxing) as long as wrapper’s data type size is less than or same as your variable’s declared data type size** | `Short s1Wrapper = 10;` <br> `Integer i1Wrapper = 10;` <br> `int i1 = i1Wrapper;` // Assigned to a wrapper class of the corresponding primitive data type. <br> `int i2 = s1Wrapper;` // Assigned to a smaller wrapper class. |                                                                                             |
| **To a casted variable or literal**                                                                                                       | `int i1 = (int) 100L;` // 100L is a literal for a long, you can cast this and assign it to an `int` as shown.                                                                                                                |                                                                                             |
| **To an instance variable of an object or class as long as the above rules apply and access modifier allows it**                           | `Foo foo = new Foo();` // Assume `Foo` class exists. <br> `int i1 = foo.myInteger;`                                                                                                                                          |                                                                                             |
| **To a return value of a method in scope, as long as the above rules apply**                                                              | `Foo foo = new Foo();` // Assume `Foo` class exists and has a method `getMethod()` which returns an `int` or wrapper `Integer` or any compatible data type. <br> `int i1 = foo.getMethod();`                                   |                                                                                             |

# summary

* A local variable is not initialized with a default value.
* You must initilize FULLy (not ins a conditional statment/ switch statment/ wile loop if all conditions are nt met) if you are using the variable in code.
* If you never use the variable , no compiler eror occurs 

# Primitive Data Types in Java

Java tiene 8 tipos de datos primitivos que se utilizan para representar valores básicos como números, caracteres y valores booleanos.

| **Primitive Data Type** | **Storage in bits (width)** | **Range of Values**                                    | **Wrapper**    |
|--------------------------|----------------------------|-------------------------------------------------------|----------------|
| `byte`                  | 8                          | -128 to 127                                           | `Byte`         |
| `short`                 | 16                         | -32,768 to 32,767                                     | `Short`        |
| `int`                   | 32                         | -2<sup>31</sup> to 2<sup>31</sup>-1 (-2,147,483,648 to 2,147,483,647) | `Integer`      |
| `long`                  | 64                         | -2<sup>63</sup> to 2<sup>63</sup>-1 (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807) | `Long`         |
| `float`                 | 32                         | Approximately ±3.40282347E+38F (6-7 significant digits)| `Float`        |
| `double`                | 64                         | Approximately ±1.79769313486231570E+308 (15-16 significant digits) | `Double`       |
| `char`                  | 16                         | `\u0000` to `\uFFFF` (Unicode range: 0 to 65,535)     | `Character`    |
| `boolean`               | JVM-dependent (usually 1)  | `true`, `false`                                       | `Boolean`      |

---

### Ejemplo de Uso de Tipos Primitivos

```java
public class PrimitiveTypesExample {
    public static void main(String[] args) {
        byte aByte = 127;
        short aShort = 32767;
        int anInt = 2147483647;
        long aLong = 9223372036854775807L;
        float aFloat = 3.14F;
        double aDouble = 3.141592653589793;
        char aChar = 'A';
        boolean aBoolean = true;

        System.out.println("byte: " + aByte);
        System.out.println("short: " + aShort);
        System.out.println("int: " + anInt);
        System.out.println("long: " + aLong);
        System.out.println("float: " + aFloat);
        System.out.println("double: " + aDouble);
        System.out.println("char: " + aChar);
        System.out.println("boolean: " + aBoolean);
    }
}