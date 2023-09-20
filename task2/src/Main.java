import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое  число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int num2 = scanner.nextInt();
        if (num1>num2) {
            System.out.print(" первое  число bolwe ");
        } else if (num1 < num2){
            System.out.print(" первое число meniwe ");
        } else {
            System.out.print(" odinakovi ");
        }
    }
}
