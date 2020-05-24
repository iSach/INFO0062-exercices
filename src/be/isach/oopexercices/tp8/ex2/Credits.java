package be.isach.oopexercices.tp8.ex2;

public class Credits {

    private final String course;
    private int credits;
    private int grade;

    public Credits(String data) throws CreditException {
        String[] s = data.split(",");

        if (s.length != 3) {
            throw new CreditException("Wrong credit format");
        }

        this.course = s[0];

        int credits;
        int grade;
        try {
            credits = Integer.parseInt(s[1]);
            grade = Integer.parseInt(s[2]);
        } catch (NumberFormatException e) {
            throw new CreditException("Credits and Grade must be an int!");
        }

        if(credits <= 0) {
            throw new CreditException("Amount of credits can't be nonpositive");
        }

        if(grade < 0 || grade > 20) {
            throw new CreditException("Grade must be between 0 and 20, included");
        }

        this.credits = credits;
        this.grade = grade;
    }

    public double getWeightedGrade() {
        return ((double) grade / 20) * credits;
    }

    public String getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public int getCredits() {
        return credits;
    }
}
