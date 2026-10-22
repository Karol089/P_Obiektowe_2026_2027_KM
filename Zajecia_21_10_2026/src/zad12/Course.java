package zad12;

import java.util.ArrayList;

public class Course {
    private String name;
    private final int maxStudents;
    private int numberOfStudents = 0;
    private ArrayList<Student> currentStudents;
    private static int numberOfCreatedCourses;
    private static final int MAX_COURSES = 3;

    public Course(String name, int maxStudents) {
        if(numberOfCreatedCourses < MAX_COURSES){
            this.name = name;
            this.maxStudents = maxStudents;
            this.currentStudents = new ArrayList<>();
            numberOfCreatedCourses++;
        } else {
            throw new IllegalStateException("Unable to proceed: Max number of courses reached.");
        }
    }

    public String getName() {
        return name;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public ArrayList<Student> getCurrentStudents() {
        return new ArrayList<>(this.currentStudents);
    }

    public void setName(String name) {
        if(name != null && !name.equals("")){
            this.name = name;
        }
    }

    public void register(Student student){
        if(student != null
                && numberOfStudents < maxStudents
                && !this.currentStudents.contains(student)
                && student.getJoinedCourses().size() < Student.getMaxJoinedCourses()
        ){
            this.currentStudents.add(student);
            this.numberOfStudents++;
            student.joinedCourses.add(this);
        }
    }

    public void cancelRegistration(Student student){
        if(student != null && currentStudents.contains(student)) {
            this.currentStudents.remove(student);
            this.numberOfStudents--;
        }
    }

    public void showInfo(){
        System.out.printf("Course name: %s \nPlaces taken %d/%d\n\n",
                this.name, this.currentStudents.size(), this.maxStudents);
    }
}
