package ec.udemy.javase11.developer.primitive_types_string.primitive_data_type.quiz;

public class Test {
    static String cad;
    static int i;

    public static void main(String[] args) {
        int i, j, k = 10; // Line 1
        i = Test.i + k; // Line 2
        k = i++ + k;  // Line 3
        //  Test.i = j+i; // Line 4 //error: variable j might not have been initialized
        System.out.println(i + " " + k);
        test2();
    }


    static void test2() {
        boolean input1 = true, input2 = false;  // Line 1
        boolean result1 = input1 = !input1; // Line 2
        boolean result2 = input2 = input1;  // Line 3
        boolean result3 = input1 == (result1 = !input2);  // Line 4
        System.out.println(input1 + " " + input2 + " " + result2 + " " + result3);

    }
}
