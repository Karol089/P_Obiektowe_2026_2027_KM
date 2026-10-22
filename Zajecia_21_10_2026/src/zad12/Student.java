package zad12;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private final String albumNumber;
    private int age;
    ArrayList<Course> joinedCourses;
    private static final int MAX_JOINED_COURSES = 2;

    public Student(String firstName, String lastName, String albumNumber, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.albumNumber = albumNumber;
        this.age = age;
        this.joinedCourses = new ArrayList<>();
    }

    public Student(){
        this("Unknown","Unknown","000000", 0);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAlbumNumber() {
        return albumNumber;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Course> getJoinedCourses() {
        return new ArrayList<>(this.joinedCourses);
    }

    public static int getMaxJoinedCourses(){
        return MAX_JOINED_COURSES;
    }

    public void setFirstName(String firstName) {
        if(firstName != null && !firstName.equals("")){
            this.firstName = firstName;
        }
    }

    public void setLastName(String firstName) {
        if(lastName != null && !lastName.equals("")){
            this.firstName = lastName;
        }
    }

    public void birthday(){
        this.age++;
    }

    public void showInfo(){
        System.out.printf("Name: %s %s \nAlbum number: %s \nCourses joined: \n",
                this.firstName,
                this.lastName,
                this.albumNumber);
        for(Course course : this.joinedCourses){
            System.out.println(" - " + course.getName());
        }
        System.out.println();
    }
}
