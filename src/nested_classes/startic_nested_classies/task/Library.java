package nested_classes.startic_nested_classies.task;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List <Book> books = new ArrayList<>();
    List <BookCategory> categories = new ArrayList<>();

    public Library(List<Book> books, List<BookCategory> categories) {
        this.books = books;
        this.categories = categories;
    }

    public void addCategory(String categoryName){
        BookCategory newCategory = new BookCategory(categoryName);
        categories.add(newCategory);
    }

    public void addBook(String title, String author, String categoryName) {
        addCategory(categoryName);
        Book book = new Book(title, author, new BookCategory(categoryName));
        books.add(book);
    }




    class BookCategory{
        private String name;

        public BookCategory(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    static class Book {
         private String title;
         private String author;
        private BookCategory category;

        public Book(String title, String author, BookCategory category) {
            this.title = title;
            this.author = author;
            this.category = category;
        }

        public String getTitle() {
             return title;
         }

         public void setTitle(String title) {
             this.title = title;
         }

         public String getAuthor() {
             return author;
         }

         public void setAuthor(String author) {
             this.author = author;
         }

        public BookCategory getCategory() {
            return category;
        }

        public void setCategory(BookCategory category) {
            this.category = category;
        }
    }
}