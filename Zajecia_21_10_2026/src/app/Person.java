package app;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Person() {
        this("Unknown", 0, "unknown@mail.mail");
    }

    public void showInfo(){
        System.out.printf("Name: %s \nAge: %d \nE-mail address: %s\n\n", this.name, this.age, this.email);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        if(name != null && !name.isBlank()) {
            this.name = name;
        }
    }

    public void birthday(){
        if(this.age < 150){
            this.age++;
        }
    }

    public void setEmail(String email) {
        if(email.contains("@")){
            this.email = email;
        }
    }
}
