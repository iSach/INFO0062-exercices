package be.isach.oopexercices.tp6.ex2;

import java.util.Vector;

public abstract class Employee extends Member {

    protected Vector<String> courses;

    public Employee(String firstName, String lastName, int id) {
        super(firstName, lastName, id);

        this.courses = new Vector<>();
    }

    public void addCourse(String course) {
        this.courses.add(course);
    }

    @Override
    public String getFullId() {
        return "u" + id;
    }
}
