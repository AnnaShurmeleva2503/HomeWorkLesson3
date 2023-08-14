import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int i = 1;
        int number = scanner.nextInt();
        int sum = 0;

        while (i <= number) {
            sum += i;
            i++;
        }
        System.out.println(number + sum);
        System.out.println();

        }
    }

