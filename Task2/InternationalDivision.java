public class InternationalDivision extends Division {
    private final String country;
    private final String language;

    public InternationalDivision(String companyName, int accountNumber, String country, String language) {
        super(companyName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.printf("""
                Company: %s (International Division)
                Account Number: %s
                County: %s
                Language: %s
                """, companyName, accountNumber, country, language);
    }
}
