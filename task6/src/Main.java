import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int num2 = scanner.nextInt();

        if ( num1 % num2 == 0) {
            System.out.println(num1 + " кратно " + num2);
        } else {
            System.out.println(num1 + " не кратно " + num2);
        }
    }
}
