/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 2: import static tests
*/

package ec.udemy.javase11.developer.simplejavaprogram;

public class StaticImportTest2 {

    public static final String APP_NAME = "Second";

    public static void log(String statement) {
        System.out.println("Second Logging statement: " + statement);
    }

    public void printUniqueStatement() {
        System.out.println("I am Second");
    }
}