package nested_classes.startic_nested_classies;

public class Library {
    private static String libraryName = "Библиотека";

    static class Book {
        public void showLibraryName() {
            System.out.println(libraryName);
        }
    }
}
class Test {
    public static void main(String[] args) {
        Library.Book book = new Library.Book();
        book.showLibraryName();
    }
}
