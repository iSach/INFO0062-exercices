package be.isach.oopexercices.tp6.ex2;

public class TeachingAssistant extends Employee {

    private final String thesis;

    public TeachingAssistant(String firstName, String lastName, int id, String thesis) {
        super(firstName, lastName, id);

        this.thesis = thesis;
    }

    public String getThesis() {
        return thesis;
    }
}
