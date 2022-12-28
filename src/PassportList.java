import java.util.Set;

public class PassportList {
    private final Set<Passport> passports;

    public PassportList(Set<Passport> passports) {
        this.passports = passports;
    }

    public Set<Passport> getPassports() {
        return passports;
    }

    public void addPassport(Passport passport){
        if (passports.contains(passport)){
            throw new IllegalArgumentException("This passport is already defined");
        }
        passports.add(passport);
        System.out.println("added in passportList: " +passport.getNumber());
    }
    public void findPassport(Passport passport){
        if (passports.contains(passport)){
            System.out.println("Fouded passport in list: "+passport.getNumber());
        }else {
            passport = null;
            System.out.println("passport is not founded");
        }
    }

    @Override
    public String toString() {
        return "PassportList{" +
                "passports=" + passports +
                '}';
    }
}
