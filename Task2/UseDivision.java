public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision i = new InternationalDivision(
                "Razor", 123123, "Singapore", "English");
        i.display();
        System.out.println();
        DomesticDivision d = new DomesticDivision(
                "Ford", 4123141, "OH");
        d.display();
    }
}
