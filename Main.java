public class Main {
    public static void main(String[] args) {
        Author author = new Author("Christopher Paolini", "Christopher.Paolini@example.com", "American");
        Book book = new Book("Eragon", 29.99, author);
        System.out.println(book.toString());
    }
}
