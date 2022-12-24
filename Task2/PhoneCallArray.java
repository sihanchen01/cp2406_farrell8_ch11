public class PhoneCallArray {
    public static void main(String[] args) {
        PhoneCall[] phoneCalls = new PhoneCall[10];
        for (int i=0; i<phoneCalls.length; i++){
            phoneCalls[i] = Math.random() < 0.5 ? new IncomingPhoneCall("123123123")
                    : new OutgoingPhoneCall("231241241", i + Math.random() * 5 + 5);
        }

        for (PhoneCall phoneCall : phoneCalls){
            phoneCall.showInfo();
        }
    }
}
