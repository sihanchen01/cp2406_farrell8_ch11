public class DomesticDivision extends Division {
    private final String state;

    public DomesticDivision(String companyName, int accountNumber, String state) {
        super(companyName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.printf("""
                Company: %s (Domestic Division)
                Account Number: %s
                State: %s
                """, companyName, accountNumber, state);
    }
}
