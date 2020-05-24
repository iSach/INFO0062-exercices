package be.isach.oopexercices.tp9.ex2;

import java.util.ArrayList;
import java.util.Objects;

public class Group implements Cloneable {

    private ArrayList<Person> persons;

    public Group() {
        this.persons = new ArrayList<>();
    }

    public void add(Person p) {
        this.persons.add(p);
    }

    public void remove(Person p) {
        this.persons.remove(p);
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Object clone() {
        Group clone = null;
        try {
            clone = (Group) super.clone();

            clone.persons = (ArrayList<Person>) persons.clone();
            for (int i = 0; i < persons.size(); i++)
                clone.persons.set(i, (Person) persons.get(i).clone());
        } catch (CloneNotSupportedException e) {
            throw new InternalError("Clone error in Group");
        }
        return clone;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Group)) {
            System.out.println("C");
            return false;
        }

        Group group = (Group) o;
        if(group.persons.size() != persons.size()) {
            System.out.println("A");
            return false;
        }

        for(int i = 0; i < group.persons.size(); i++) {
            if(!group.persons.get(i).equals(persons.get(i))) {
                System.out.println("B");
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(persons);
    }

    @Override
    public String toString() {
        return "Group{" +
                "persons=" + persons +
                '}';
    }
}
