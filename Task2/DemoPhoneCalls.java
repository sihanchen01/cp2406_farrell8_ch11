public class DemoPhoneCalls {
    public static void main(String[] args) {
        IncomingPhoneCall incomingPhoneCall = new IncomingPhoneCall("123456789");
        incomingPhoneCall.showInfo();
        OutgoingPhoneCall outgoingPhoneCall = new OutgoingPhoneCall("987654321", 5.2);
        outgoingPhoneCall.showInfo();
    }
}
