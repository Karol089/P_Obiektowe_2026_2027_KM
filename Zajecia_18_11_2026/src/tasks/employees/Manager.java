package tasks.employees;

public class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return this.getBaseSalary() + this.getBaseSalary() * 0.50;
    }
}
