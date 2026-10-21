package animals;

public class Cat {

    private String name;
    private int age = 0;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void makeSound(){
        System.out.println("Meow!");
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
