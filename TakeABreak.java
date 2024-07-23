import java.util.Scanner;

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
}