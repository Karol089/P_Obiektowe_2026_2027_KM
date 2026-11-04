package tasks.employees;

public class Tester extends Employee {

    @Override
    public int calculateSalary() {
        return super.calculateSalary() + 1000;
    }
}
