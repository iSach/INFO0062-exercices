package be.isach.oopexercices.tp6.ex2;

import java.util.Vector;

public class StudentMonitor extends Student {

    private Vector<String> courses;

    public StudentMonitor(String firstName, String lastName, int id) {
        super(firstName, lastName, id);

        this.courses = new Vector<>();
    }

    public void addCourse(String course) {
        this.courses.add(course);
    }
}
