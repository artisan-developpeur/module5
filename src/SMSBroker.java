public class SMSBroker {

    private static SMSBroker broker = null;

    protected SMSBroker() throws Exception {
        connectToServers();
    }

    public static SMSBroker getInstance() throws Exception {
        if (broker == null) {
            broker = new SMSBroker();
        }
        return broker;
    }

    public static void setInstance(SMSBroker broker) {
        SMSBroker.broker = broker;
    }

    public static void resetInstance() throws Exception {
        SMSBroker.broker = new SMSBroker();
    }

    public void sendSMS(String phoneNumber, String message) throws Exception {
        System.out.println("SMS vers le ["+phoneNumber+"] : "+message);
    }

    protected void connectToServers() throws Exception {
        // connect to the real network to send the SMS
    }

}
