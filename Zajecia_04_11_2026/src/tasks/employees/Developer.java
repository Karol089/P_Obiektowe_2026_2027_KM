package tasks.employees;

public class Developer extends Employee {

    @Override
    public int calculateSalary() {
        return super.calculateSalary() + 2000;
    }
}
