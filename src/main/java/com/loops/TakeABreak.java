package src.main.java.com.loops;

import java.util.Scanner;
import src.test.java.com.loops.TakeABreakTest;

public class TakeABreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response = "";
        while (!response.equalsIgnoreCase("yes")) {
            System.out.println("Do you want to take a break?");
            response = sc.nextLine();
        }

        System.out.println("You have decided to take a break.");
    }

    public static String takeABreak(String yes) {
        if ("yes".equalsIgnoreCase(yes)) {
            return "Break time!";
        }
        return "No break yet.";
    }
}