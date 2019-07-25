import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        Employee benoit = new Employee("+33612345678",
                "Benoit",
                "Gantaume",
                new Date(1979, 6, 25));
        HappyBirthday hb = new HappyBirthday();
        hb.checkAnniversaryDate(benoit);
    }
}
