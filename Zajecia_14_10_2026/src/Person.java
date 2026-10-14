public class Person {
    String name;

    public Person() {
        this("Unknown");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(Person other) {
        this(other.name);
    }

    public void introduceYourself(){
        System.out.printf("Hello! My name is %s!\n\n", this.name);
    }
}
