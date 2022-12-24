public abstract class NewspaperSubscription {
    protected String name;
    protected String address;
    protected double rate;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getRate() {
        return rate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.printf("Newspaper \"%s\" -> %s, rate: $%.2f\n", this.getName(), this.getAddress(), this.getRate());
    }

    public abstract void setAddress(String address) throws WrongAddressException;
}
