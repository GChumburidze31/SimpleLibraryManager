

public class Book {

    private String title;
    private String author;
    private int numberOfPages;


    public Book(String title, String author, int numberOfPages) {

        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;

    }

    //getters

    public String getTitle () {return title;}
    public String getAuthor () {return author;}
    public int getNumPages() {return numberOfPages;}}

