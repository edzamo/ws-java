/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Local Variable Type Inference
*/

package ec.udemy.javase11.developer.primitive_types_string.local_variable_type_inference;

public class AClassWithAVeryLongName {
    String name;

    public AClassWithAVeryLongName() {
        // TODO document why this constructor is empty
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "AClassWithAVeryLongName{" +
                "name='" + name + '\'' +
                '}';
    }
}