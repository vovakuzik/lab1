import java.util.Scanner;
public class Main {
        public static void main(String[] args)
        {
                public class AccountTest {
                 public static void main(String[] args)
                {
                        Main account1 = new Main ("Jane Green", 50.00);

                         Main account2 = new Main("John Blue", -7.53);

                         // display initial balance of each object
                         System.out.printf("%s balance: $%.2f%n",
                                 account1.getName() );  System.out.printf("%s balance: $%.2f%n%n",

                                // display balances
                                account1.getBalance(),
                                account2.getName(),

                                account2.getBalance()
                        );
                        // create a Scanner to obtain input from the command window
                        Scanner input = new Scanner(System.in);

                         System.out.print("Enter deposit amount for account1: "); // prompt
                        double depositAmount = input.nextDouble(); // obtain user input

                        System.out.printf("%nadding %.2f to account1 balance%n%n",
                                 depositAmount);

                        account1.deposit(depositAmount); // add to account1’s balance
                        System.out.printf("%s balance: $%.2f%n",
                                 account1.getName(),
                                 System.out.printf("%s balance: $%.2f%n%n",
                                        account2.getName() );
                        account1.getBalance());
                        account2.getBalance()

                         System.out.print("Enter deposit amount for account2: "); // prompt
                        depositAmount = input.nextDouble(); // obtain user input

                        System.out.printf("%nadding %.2f to account2 balance%n%n",
                                depositAmount);

                        account2.deposit(depositAmount); // add to account2 balance

                         // display balances
                        System.out.printf("%s balance: $%.2f%n",
                                 account1.getName(),
                                account1.getBalance()
                        );
                         System.out.printf("%s balance: $%.2f%n%n",
                                account2.getName(), );
                } // end main
                 } // end class AccountTest