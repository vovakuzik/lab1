public class AccountTest {
    public static void main(String[] args) {
        
        Account account1 = new Account("Джейн Грин", 20.00);
        Account account2 = new Account("Джон Блу", 0);

        
        displayAccount(account1);
        displayAccount(account2);

        
        account1.deposit(25.53);
        account2.deposit(450.28);

        
        displayAccount(account1);
        displayAccount(account2);
    }

    
    public static void displayAccount(Account accountToDisplay) {
        System.out.printf("Владелец счета: %s%nБаланс: $%.2f%n",
                accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}
