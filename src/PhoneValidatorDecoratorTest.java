import org.junit.Test;

import java.util.Date;

public class PhoneValidatorDecoratorTest {

    @Test(expected = Exception.class)
    public void checkAnniversaryDate() throws Exception {
        Employee benoit = new Employee("+33612",
                "Benoit",
                "Gantaume",
                new Date(1979, 6, 29));
        HappyBirthday hb = new PhoneValidatorDecorator(new HappyBirthday());
        hb.checkAnniversaryDate(benoit);
    }
}