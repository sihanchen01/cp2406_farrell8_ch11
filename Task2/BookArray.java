public class BookArray {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        for(int i=0; i<books.length; i++){
            books[i] = Math.random() < 0.5 ? new Fiction("fiction " + i)
                    : new NonFiction("non-fiction " + i);
        }

        for(Book book : books){
            System.out.printf("Book \"%s\" - $%.2f\n", book.getTitle(), book.getPrice());
        }
    }
}
