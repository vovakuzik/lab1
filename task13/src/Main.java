class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void applyRaise() {
        monthlySalary *= 1.10; // Повышение на 10%
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Doe", 5000.0);
        Employee employee2 = new Employee("Jane", "Smith", 6000.0);

        System.out.println("Годовая зарплата для сотрудника 1: $" + employee1.getYearlySalary());
        System.out.println("Годовая зарплата для сотрудника 2: $" + employee2.getYearlySalary());

        employee1.applyRaise();
        employee2.applyRaise();


        System.out.println("Годовая зарплата после повышения на 10% для сотрудника 1: $" + employee1.getYearlySalary());
        System.out.println("Годовая зарплата после повышения на 10% для сотрудника 2: $" + employee2.getYearlySalary());
    }
}
