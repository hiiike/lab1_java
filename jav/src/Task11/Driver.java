package Task11;

public class Driver {
    private String firstName;
    private String secondName;
    private int experience;

    public Driver(final String firstName, final String secondName, final int experience) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.experience = experience;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(final String secondName) {
        this.secondName = secondName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(final int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", experience=" + experience +
                '}';
    }
}
