package ec.udemy.javase11.developer.understanding;

public class TestMultipleInheritance {


    interface InterfazA {
        void metodoA();
    }

    interface InterfazB {
        void metodoB();
    }

    class ClaseC implements InterfazA, InterfazB {
        @Override
        public void metodoA() {
            System.out.println("Implementación de metodoA");
        }

        @Override
        public void metodoB() {
            System.out.println("Implementación de metodoB");
        }
    }




}
