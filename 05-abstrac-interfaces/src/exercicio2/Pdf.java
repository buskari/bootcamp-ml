package exercicio2;

public class Pdf extends Document {
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
        super(DocType.PDF);
        this.pagesNumber = pagesNumber;
        this.author = author;
        this.title = title;
        this.genre = genre;
    }
}
