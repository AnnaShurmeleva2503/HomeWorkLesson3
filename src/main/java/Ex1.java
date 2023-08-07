import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("enter the month number: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 12: case 1: case 2:
                System.out.println("this is winter");
                break;
            case 3 : case 4: case 5:
                System.out.println("this is spring");
                break;
            case 6: case 7: case 8:
                System.out.println("this is summer");
                break;
            case 9: case 10: case 11:
                System.out.println("this is autumn");
            default:
                System.out.println("this is not a month number");
        }
    }
}


