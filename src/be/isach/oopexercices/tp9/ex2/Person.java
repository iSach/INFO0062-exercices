package be.isach.oopexercices.tp9.ex2;

public class Person implements Cloneable {

    private String firstName;
    private String lastName;
    private String bio;

    public Person(String firstName, String lastName, String bio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
    }

    public Person(String firstName, String lastName) {
        this(firstName, lastName, null);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public Object clone() {
        Person person = null;
        try {
            person = (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new InternalError("Clone error in Person");
        }
        return person;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person)) return false;

        Person other = (Person) o;

        if((other.getBio() != null && bio == null)
            || bio != null && other.getBio() == null) return false;

        if (other.getBio() != null && !other.getBio().equals(bio)) return false;

        return other.getFirstName().equals(firstName)
                && other.getLastName().equals(lastName);
    }

    @Override
    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode() + bio.hashCode();
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bio='" + bio + '\'' +
                '}';
    }
}
