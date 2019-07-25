public class SMSBroker {

    private static SMSBroker broker = null;

    private SMSBroker() throws Exception {
        connectToServers();
    }

    public static SMSBroker getInstance() throws Exception {
        if (broker == null) {
            broker = new SMSBroker();
        }
        return broker;
    }

    public void sendSMS(String phoneNumber, String message) throws Exception {
        System.out.println("SMS vers le ["+phoneNumber+"] : "+message);
    }

    protected void connectToServers() throws Exception {
        throw new Exception("Cannot connect to server");
        // connect to the real network to send the SMS
    }

}
