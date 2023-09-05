package Task_2;


/**
 * 2. Создать класс Book. Создать классы Title, Author и Content, каждый из
 * которых должен содержать одно строковое поле и метод void Show().
 * Реализуйте возможность добавления в книгу названия книги, имени
 * автора и содержания. Выведите на экран при помощи метода Show()
 * название книги, имя автора и содержание.
 */
public class Main {
    public static void main(String[] args) {
        Author author = new Author();
        author.setAuthor("Frankl");
//        System.out.println(author.getAuthor());
        author.show();

        Book book = new Book();
        book.setBook("MartinEden");
//        System.out.println(book.getBook());
        book.show();

        Content content = new Content();
        content.setContent("MagicBook");
//        System.out.println(content.getContent());
        content.show();

    }
}
