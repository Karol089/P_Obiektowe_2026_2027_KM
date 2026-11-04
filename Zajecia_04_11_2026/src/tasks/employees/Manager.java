package tasks.employees;

public class Manager extends Employee {

    @Override
    public int calculateSalary() {
        return super.calculateSalary() + 4000;
    }
}
