
package ec.udemy.javase11.developer.simplejavaprogram.quiz.pet.dog;
/*
* Good job!
Correct Answer. Package statement must be the first line of code in a source file, excluding comments and white
* space. The compiler error is on the package statement and not the lines of code above it.
* */

import java.util.List;
//package ec.udemy.simplejavaprogram.quiz.pet.dog;

public class Pug {
    public static void main(String[] args) {

        System.out.println("arg:" + args.toString());
        List<String> possibleNames = List.of(args);
        for (String name : possibleNames) {
            System.out.println("Maybe Pug should be called: " + name);   //  <Line 3>
        }
    }
}
