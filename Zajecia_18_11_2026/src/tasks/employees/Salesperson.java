package tasks.employees;

public class Salesperson extends Employee {
    public Salesperson(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return this.getBaseSalary() + this.getBaseSalary() * 0.30;
    }
}
