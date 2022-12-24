public class OutgoingPhoneCall extends PhoneCall {
    private final double minutes;

    public OutgoingPhoneCall(String phoneNumber, double minutes) {
        super(phoneNumber);
        this.minutes = minutes;
        this.price = minutes * 0.04;
    }

    public double getMinutes() {
        return minutes;
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
        System.out.printf("""
                        Outgoing call
                        \tPhone number: %s;
                        \trate: $0.04;
                        \tminutes: %.2f minutes;
                        \tprice of the call: $%.2f;
                        """,
                this.getPhoneNumber(), this.getMinutes(), this.getPrice());
    }
}
