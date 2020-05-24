package be.isach.oopexercices.tp6.ex2;

public abstract class Member {

    protected String firstName, lastName;
    protected int id;

    public Member(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public abstract String getFullId();

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
