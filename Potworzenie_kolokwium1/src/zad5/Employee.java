package zad5;

public abstract class Employee {
    private static double baseSalary = 3600.00;

    public static double getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateSalary();

    public static double calculate(Employee employee) {
        return employee.calculateSalary();
    }
}
