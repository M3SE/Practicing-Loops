package src.main.java.com.loops;

import java.util.Scanner;
import src.test.java.com.loops.CountToElevenTest;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number less than 11:");
        int number = scanner.nextInt();

        if (number >= 11) {
            System.out.println("The number must be less than 11.");
        } else {
            for (int i = number; i <= 11; i++) {
                System.out.println(i);
            }
        }
    }

    public static int countToEleven(int i) {
        if (i < 11) {
            return 11;
        }
        return i;
    }
}