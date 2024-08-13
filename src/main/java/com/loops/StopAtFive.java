package src.main.java.com.loops;

import java.util.Scanner;
import src.test.java.com.loops.StopAtFiveTest;


public class StopAtFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        while (n != 5) {
            System.out.println("Give a number:");
            n = sc.nextInt();
        }

        System.out.println("You entered 5. The loop is stopped.");
    }

    public static int[] stopAtFive(int i) {
        if (i <= 0) {
            return new int[]{};
        }
        int limit = Math.min(i, 4);
        int[] result = new int[limit];
        for (int j = 0; j < limit; j++) {
            result[j] = j + 1;
        }

        return result;
    }
}