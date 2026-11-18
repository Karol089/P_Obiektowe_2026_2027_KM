package tasks.employees;

public class Developer extends Employee {
    public Developer(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return this.getBaseSalary() + this.getBaseSalary() * 0.20;
    }
}
