package zad5;

public class Developer extends Employee {
    @Override
    public double calculateSalary() {
        return Employee.getBaseSalary() * 1.35;
    }
}
