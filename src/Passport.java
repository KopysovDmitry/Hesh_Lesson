import java.util.Objects;

public class Passport {
    private int number;
    private String lastName;
    private String firstName;
    private String fatherName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfbith;

    public Passport(int number, String lastName, String firstName, String fatherName, int dayOfBirth, int monthOfBirth, int yearOfbith) {
        if (number <=0){
            throw new RuntimeException("Incorrect Data");
        }else {this.number = number;}

        if (lastName == null&& lastName.isEmpty() && lastName.isBlank()) {
            throw new RuntimeException("Incorrect Data");
        }else {this.lastName = lastName;
        }
        if (firstName == null&& firstName.isEmpty() && firstName.isBlank()) {
            throw new RuntimeException("Incorrect Data");
        }else {this.firstName = firstName;
        }

        this.fatherName = fatherName;

        if (dayOfBirth <=0){
            throw new RuntimeException("Incorrect Data");
        }else {this.dayOfBirth = dayOfBirth;}
        if (monthOfBirth <=0){
            throw new RuntimeException("Incorrect Data");
        }else {this.monthOfBirth = monthOfBirth;}
        if (yearOfbith <=0){
            throw new RuntimeException("Incorrect Data");
        }else {this.yearOfbith = yearOfbith;}

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfbith() {
        return yearOfbith;
    }

    public void setYearOfbith(int yearOfbith) {
        this.yearOfbith = yearOfbith;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passport)) return false;
        Passport passport = (Passport) o;
        return getNumber() == passport.getNumber() && getDayOfBirth() == passport.getDayOfBirth() && getMonthOfBirth() == passport.getMonthOfBirth() && getYearOfbith() == passport.getYearOfbith() && Objects.equals(getLastName(), passport.getLastName()) && Objects.equals(getFirstName(), passport.getFirstName()) && Objects.equals(getFatherName(), passport.getFatherName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getLastName(), getFirstName(), getFatherName(), getDayOfBirth(), getMonthOfBirth(), getYearOfbith());
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number=" + number +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", monthOfBirth=" + monthOfBirth +
                ", yearOfbith=" + yearOfbith +
                '}';
    }
}
