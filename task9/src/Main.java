public class Main {
    public static void main(String[] args) {
        // Вывести заголовок таблицы
        System.out.println("Число | Квадрат | Куб");
        System.out.println("-----------------------");

        // Вычислить и вывести квадраты и кубы для чисел от 0 до 10
        for (int num = 0; num <= 10; num++) {
            int square = num * num;
            int cube = num * num * num;
            System.out.printf("%6d | %6d | %4d%n", num, square, cube);
        }
    }
}
