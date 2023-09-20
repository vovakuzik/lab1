import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Инициализация счетчиков
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        // Ввод пяти чисел
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            double num = input.nextDouble();

            // Проверка, является ли число положительным, отрицательным или нулем,
            // и увеличение соответствующих счетчиков
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        // Вывод ΩΩΩ
        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);
        System.out.println("Количество нулей: " + zeroCount);


    }
}
