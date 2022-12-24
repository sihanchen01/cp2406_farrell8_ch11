public class UseBook {
    public static void main(String[] args) {
        Fiction fiction = new Fiction("Klara and the Sun");
        System.out.printf("Book \"%s\" - $%.2f\n", fiction.getTitle(), fiction.getPrice());
        NonFiction nonFiction = new NonFiction("Why we Sleep");
        System.out.printf("Book \"%s\" - $%.2f\n", nonFiction.getTitle(), nonFiction.getPrice());
    }
}
