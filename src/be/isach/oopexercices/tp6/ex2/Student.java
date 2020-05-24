package be.isach.oopexercices.tp6.ex2;

public class Student extends Member {

    public Student(String firstName, String lastName, int id) {
        super(firstName, lastName, id);
    }

    @Override
    public String getFullId() {
        return "s" + id;
    }
}
