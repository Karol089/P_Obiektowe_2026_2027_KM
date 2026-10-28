package tasks.task2_employee;

public class Manager extends Employee{
    private String department;

    public Manager(String firstName, String lastName, String position, String department) {
        super(firstName, lastName, position);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String showInformation() {
        return super.showInformation() + "Overlooked department: %s".formatted(this.department);
    }
}
