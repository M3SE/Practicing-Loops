package src.main.java.com.loops;

import java.util.Scanner;
import src.test.java.com.loops.MultiplicationTest;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        System.out.println("src.main.java.Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }

    public static int multiply(int i, int i1) {
        return i * i1;
    }
}