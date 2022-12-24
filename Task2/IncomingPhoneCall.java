public class IncomingPhoneCall extends PhoneCall {
    public IncomingPhoneCall(String phoneNumber) {
        super(phoneNumber);
        this.price = 0.02;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void showInfo() {
        System.out.printf("Incoming call\n\tPhone number: %s;\n\trate: $0.02;\n\tprice of the call: $0.02;\n",
                this.getPhoneNumber());
    }
}
