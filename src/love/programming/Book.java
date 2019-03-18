package love.programming;

public class Book {

    String bookGenre;
    String bookName;
    int noOfPages;

    public Book(){
    this("defaultType","defaultName",100);

    }

    public Book(String bookGen){
        bookGen = bookGen;
        System.out.println(bookGen);
        //this.bookGenre = bookGenre;
        //System.out.println(bookGenre);
    }
    public Book(String bookGenre,String bookName){
        this.bookGenre = bookGenre;
        this.bookName = bookName;
    }
    public Book(String bookGenre,String bookName, int noOfPages){
        this.bookGenre = bookGenre;
        this.bookName = bookName;
        this.noOfPages = noOfPages;

    }
    public void printMethodbookGenre(){
        System.out.println(bookGenre);
    }
    public void printMethodbookName(){
        System.out.println(bookName);
    }
    public void printMethodnoOfPages(){
        System.out.println(noOfPages);
    }
}
