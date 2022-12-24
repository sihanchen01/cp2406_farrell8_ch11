public class DemoSubscriptions {
    public static void main(String[] args) {
        PhysicalNewspaperSubscription p1 = new PhysicalNewspaperSubscription();
        p1.setName("Wall Street Journal");
        try {
            p1.setAddress("Arlington St");
            p1.showInfo();
        } catch (WrongAddressException e) {
            e.printStackTrace();
        }

        PhysicalNewspaperSubscription p2 = new PhysicalNewspaperSubscription();
        p2.setName("Wall Street Journal");
        try {
            p2.setAddress("2 Arlington St");
            p2.showInfo();
        } catch (WrongAddressException e) {
            e.printStackTrace();
        }

        OnlineNewspaperSubscription o1 = new OnlineNewspaperSubscription();
        o1.setName("USA Today");
        try {
            o1.setAddress("john.gmail.com");
            o1.showInfo();
        } catch (WrongAddressException e) {
            e.printStackTrace();
        }

        OnlineNewspaperSubscription o2 = new OnlineNewspaperSubscription();
        o2.setName("USA Today");
        try {
            o2.setAddress("john@gmail.com");
            o2.showInfo();
        } catch (WrongAddressException e) {
            e.printStackTrace();
        }
    }
}
