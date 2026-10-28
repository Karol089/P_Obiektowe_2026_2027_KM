package tasks.task11;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void showInformation() {
        System.out.println(
                "Person: " + this.name
        );
    }
}
