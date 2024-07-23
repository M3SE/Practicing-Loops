import java.util.Scanner;

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
}