import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;
        int difference = num1 - num2;

        // Обработать деление на ноль
        if (num2 != 0) {
            double quotient = (double) num1 / num2;
            System.out.println("Сумма: " + sum);
            System.out.println("Произведение: " + product);
            System.out.println("Разность: " + difference);
            System.out.println("Частное: " + quotient);
        } else {
            System.out.println("Деление на ноль невозможно.");
        }

        scanner.close();
    }
}
