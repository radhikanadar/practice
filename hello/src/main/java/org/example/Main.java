package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Ctrl+1 with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        System.out.println("Input an integer between 10 to 20");
        Scanner input = new Scanner(System.in);
        String inputStr = input.nextLine();
        List<Integer> intArray = Arrays.stream(inputStr.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(inputStr);
        intArray.forEach(System.out::println);
        // Press Alt+Shift+X or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Alt+Shift+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+Shift+B.
            System.out.println("i = " + i);
        }
    }
}