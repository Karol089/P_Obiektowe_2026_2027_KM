package zad4;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    protected String getName() {
        return this.name;
    }

    public void identify() {
        System.out.println(
                "Person: " + this.name
        );
    }
}
