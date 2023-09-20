import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1=1;
        int num2=2;
        int num3=6;
        int num4=4;
        int num5=5;


        int min = Math.min(Math.min(Math.min(Math.min(num1, num2), num3), num4), num5);
        System.out.println("Наименьшее число: " + min);
        int max = Math.max(Math.max(Math.max(Math.max(num1, num2), num3), num4), num5);
        System.out.println("Наибольшее число: " + max);
    }
}
