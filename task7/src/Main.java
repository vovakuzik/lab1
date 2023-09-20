import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус окружности (целое число): ");
        int radius = scanner.nextInt();

        // Вычислить диаметр
        double diameter = 2.0 * radius;

        // Вычислить длину окружности
        double circumference = 2.0 * 3.14159 * radius;

        // Вычислить площадь окружности
        double area = 3.14159 * radius * radius;

        System.out.println("Диаметр окружности: " + diameter);
        System.out.println("Длина окружности: " + circumference);
        System.out.println("Площадь окружности: " + area);

        scanner.close();
    }
}
