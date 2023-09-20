import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое  число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;
        System.out.println("sum = " + sum);

        double average = (double) sum / 3;
        System.out.println("average = " + average);

        int product = num1 * num2 * num3 ;
        System.out.println("product = " + product);

        int min = Math.min(Math.min( num1,num2),num3);
        System.out.println("min = " + min);

        int max = Math.max(Math.max( num1,num2),num3);
        System.out.println("max= " + max);

    }
}
