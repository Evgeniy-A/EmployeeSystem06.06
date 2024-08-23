package clone.taskbook;

public class Test {
    public static void main(String[] args) {

        Book book = new Book("Текст");
        Book book1 = new Book(book);
        System.out.println(book1.getTitle());
    }
}
