package zad5;

public class Manager extends Employee {
    @Override
    public double calculateSalary() {
        return Employee.getBaseSalary() * 1.5;
    }
}
