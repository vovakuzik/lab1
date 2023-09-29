class Account {
    private String name;
    private double balance;

    // Конструктор для инициализации переменных экземпляра
    public Account(String name, double balance) {
        this.name = name;
        // Проверка, является ли balance положительным числом, перед его установкой
        if (balance > 0.0) {
            this.balance = balance;
        } else {
            this.balance = 0.0;
        }
    }

    // Методы set и get для name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Методы set и get для balance
    public void setBalance(double balance) {
        // Проверка, является ли balance положительным числом, перед его установкой
        if (balance > 0.0) {
            this.balance = balance;
        } else {
            this.balance = 0.0;
        }
    }

    public double getBalance() {
        return balance;
    }

    // Метод для внесения депозита
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance += depositAmount;
        }
    }
}