package zad4;

public class Student extends Person {

    private int albumNumber;

    public Student(String name, int albumNumber) {
        super(name);
        this.albumNumber = albumNumber;
    }

    @Override
    public void identify() {
        System.out.println(
                getName()
                        + " / "
                        + albumNumber
        );
    }
}