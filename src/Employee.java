import java.util.Date;

public class Employee {
    private String phoneNumber, firstName, lastName;
    private Date birthDate;

    public Employee(String phoneNumber, String firstName, String lastName, Date birthDate) {
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
