
import java.util.Scanner;
public class Main {
    private String name;
    private double balance;
    public Main(String name, double balance){
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        }
    }
    public void deposit (double depositAmount){
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    }
    public void withdraw (double withdrawAmount){
        if (withdrawAmount < balance) {
            balance = balance - withdrawAmount;
        } else {
            System.out.println("Withdrawal amount exceeded account balance");
        }
    }
    public double getBalance() {
        return balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Main Account = new Main("vladimir Cuzic", 2345);
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("\nСкоко хочешь снять?: ");
        n = input.nextInt();
        input.close();
        Account.withdraw(n);
        System.out.println(Account.getBalance());
    }
}
