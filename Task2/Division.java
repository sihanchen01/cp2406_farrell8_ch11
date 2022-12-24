public abstract class Division {
    protected String companyName;
    protected int accountNumber;

    public Division(String companyName, int accountNumber) {
        this.companyName = companyName;
        this.accountNumber = accountNumber;
    }

    public abstract void display();
}
