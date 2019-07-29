public class PhoneValidatorDecorator extends HappyBirthday {
    HappyBirthday hb;

    public PhoneValidatorDecorator(HappyBirthday hb) {
        this.hb = hb;
    }

    @Override
    public void checkAnniversaryDate(Employee e) throws Exception {
        if (e.getPhoneNumber().length() != 10) {
            throw new Exception("Invalid phone number");
        }
        hb.checkAnniversaryDate(e);
    }
}