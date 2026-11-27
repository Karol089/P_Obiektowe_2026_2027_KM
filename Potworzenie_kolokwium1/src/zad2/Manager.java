package zad2;

public class Manager extends Employee {

    private double baseSalary;
    private double bonus;

    public Manager(
            String name,
    double baseSalary,
    double bonus
    ) {
        super(name);

        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return this.baseSalary
                + this.bonus;
    }
}
