package tasks.employees;

public abstract class Employee {
    private String name;
    private double baseSalary = 3600.54;

    public Employee(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void raiseBaseSalary(double amount) {
        if(amount > 0){
            this.baseSalary += amount;
        }
    }

    public void lowerBaseSalary(double amount) {
        if(amount > 0 && amount < this.baseSalary){
            this.baseSalary -= amount;
        }
    }

    public abstract double calculateSalary();

    public void printPayslip(){
        System.out.printf("Name: %s \nPaycheck: %.2f PLN\n\n", this.name, this.calculateSalary());
    }
}
