package day50_inheritance;

public class BookObjects {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "intro to java";
        book.author = "Murodil";
        book.type = "Programming";
        book.price = 85.0;


        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        AudioBook audioBook = new AudioBook();
        audioBook.author = "Thukba";
        audioBook.length= 60;
        audioBook.narrator = "Imak";
        audioBook.title = "Irina";
        audioBook.price = 44.99;
        audioBook.type = "Automation";
        audioBook.listen();

    }
}
