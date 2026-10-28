package tasks.task2_employee;

import tasks.task2_person.Person;

public class Employee extends Person {
    private String position;

    public Employee(String firstName, String lastName, String position) {
        super(firstName, lastName);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void showData(){
        System.out.printf("First name: %s \nLast name: %s \nPosition: %s\n\n",
                this.getFirstName(),
                this.lastName,
                this.position);
    }
}
