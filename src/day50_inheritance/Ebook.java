package day50_inheritance;

public class Ebook extends Book{
    int size;
    int pages;

    public void readBook(){
        System.out.println("Reading book: ");
        System.out.println("Title = " + title);
        System.out.println("Author = " + author);
        System.out.println("Price = " + price);
        System.out.println("Size = " + size);
    }
}
