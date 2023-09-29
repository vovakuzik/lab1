public class AccountTest {
    public static void main(String[] args) {
        // Создаем два объекта Account
        Account account1 = new Account("Джейн Грин", 20.00);
        Account account2 = new Account("Джон Блу", 0);

        // Выводим начальный баланс каждого счета
        displayAccount(account1);
        displayAccount(account2);

        // Выполняем операции со счетами
        account1.deposit(25.53);
        account2.deposit(450.28);

        // Выводим балансы после внесения депозита
        displayAccount(account1);
        displayAccount(account2);
    }

    // Метод для отображения имени и баланса счета
    public static void displayAccount(Account accountToDisplay) {
        System.out.printf("Владелец счета: %s%nБаланс: $%.2f%n",
                accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}