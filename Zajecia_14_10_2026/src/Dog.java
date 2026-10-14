public class Dog {
    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void bark(){
        System.out.println("Wow Wow\n");
    }

    public void showInfo(){
        System.out.printf("Name: %s \nBreed: %s \nAge: %d", this.name, this.breed, this.age);
    }
}
