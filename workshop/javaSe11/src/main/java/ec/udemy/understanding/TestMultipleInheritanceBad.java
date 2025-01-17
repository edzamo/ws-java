package ec.udemy.understanding;

public class TestMultipleInheritanceBad {


    class ClaseA {
        void metodoA() {
            System.out.println("Método de ClaseA");
        }
    }

    class ClaseB {
        void metodoB() {
            System.out.println("Método de ClaseB");
        }
    }

    /*
     * Esto no es permitido en Java
     *
     *
     * 1. Herencia múltiple de clases (NO permitida):
     * Java no permite que una clase herede de múltiples clases. Esto significa que una clase puede extender
     * (heredar de) una sola clase base. Esto es para evitar el problema del "diamante de herencia", donde una
     *  clase hereda de dos clases base que tienen un método con la misma firma. Java no podría decidir cuál
     *  implementación usar.
     * */
    //  class ClaseC extends ClaseA, ClaseB {
    // Error de compilación
    // }


}
