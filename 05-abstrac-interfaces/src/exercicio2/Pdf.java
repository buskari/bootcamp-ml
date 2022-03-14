package exercicio2;

public class Pdf {
    private Integer pagesNumber;
    private String author;
    private String title;
    private String genre;

    public Pdf(
        Integer pagesNumber,
        String author,
        String title,
        String genre
    ) {
        this.pagesNumber = pagesNumber;
        this.author = author;
        this.title = title;
        this.genre = genre;
    }
}
