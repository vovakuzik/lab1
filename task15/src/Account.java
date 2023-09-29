class Account {
    private String name;
    private double balance;

    
    public Account(String name, double balance) {
        this.name = name;
        
        if (balance > 0.0) {
            this.balance = balance;
        } else {
            this.balance = 0.0;
        }
    }

   
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

   
    public void setBalance(double balance) {
        
        if (balance > 0.0) {
            this.balance = balance;
        } else {
            this.balance = 0.0;
        }
    }

    public double getBalance() {
        return balance;
    }

    
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance += depositAmount;
        }
    }
}
