package be.isach.oopexercices.tp6.ex2;

import java.util.Vector;

public class Teacher extends Employee {

    private Vector<TeachingAssistant> thesisStudents;

    public Teacher(String firstName, String lastName, int id) {
        super(firstName, lastName, id);

        this.thesisStudents = new Vector<>();
    }

    public void addThesisStudent(TeachingAssistant assistant) {
        this.thesisStudents.add(assistant);
    }

    public Vector<TeachingAssistant> getThesisStudents() {
        return thesisStudents;
    }
}
