import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите пятизначное число: ");
        int number = scanner.nextInt();

        // Разделяем цифры
        int digit1 = number / 10000;
        int digit2 = (number % 10000) / 1000;
        int digit3 = (number % 1000) / 100;
        int digit4 = (number % 100) / 10;
        int digit5 = number % 10;

        // Выводим цифры, разделенные тремя пробелами
        System.out.printf("%d   %d   %d   %d   %d%n", digit1, digit2, digit3, digit4, digit5);

    }
}
