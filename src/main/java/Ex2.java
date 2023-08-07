import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("enter the month number: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("зима");
        }
        else if (month == 3 || month == 4 || month == 5) {
            System.out.println("весна");
        }
        else if (month == 6 || month == 7 || month == 8) {
            System.out.println("лето");
        }
        else {
            System.out.println("осень");
        }
    }
}
