import java.util.Date;

public class HappyBirthday {

    public HappyBirthday() {
    }

    public void checkAnniversaryDate(Employee e) throws Exception {
        Date birthDate = e.getBirthDate();
        Date now = new Date();
        if (now.getDate() == birthDate.getDate() &&
                now.getMonth() == birthDate.getMonth()) {
            SMSBroker.getInstance().sendSMS(
                    e.getPhoneNumber(),
                    "Happy Birthday "+e.getFirstName()
            );
        }
    }
}
