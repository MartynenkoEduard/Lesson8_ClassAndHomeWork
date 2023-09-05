package Task_2;

public class Book {
    String book;

    public  String getBook() {
        return book;
    }

    public boolean setBook(String book) {
        if (Author.isAlphabetic(book)) {
            this.book = book;
            return true;
        } else {
            return false;
        }
    }

    public void show() {
        System.out.println( "Book: " +
                book) ;
    }

}
