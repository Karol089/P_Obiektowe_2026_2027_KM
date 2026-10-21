package animals;

public class Dog {

    private String name;
    private int age = 0;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void makeSound(){
        System.out.println("Woof, woof!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void birthday(){
        this.age++;
    }
}