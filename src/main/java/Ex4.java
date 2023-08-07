import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        int temperature = scanner.nextInt();

        if (temperature >- 5) {
            System.out.println("Тепло");
        } else if (temperature <= -5 && temperature > -20 ) {
            System.out.println("Нормально");
        } else if (temperature <= -20) {
            System.out.println("Холодно");
        }
        String result = (temperature >= -5) ? "Тепло"
                : (temperature >= -20) ? "Нормально" : "Холодно";

        System.out.println(result);
    }
}
