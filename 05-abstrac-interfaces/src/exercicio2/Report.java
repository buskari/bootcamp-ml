package exercicio2;

public class Report {
    private Integer textLength;
    private Integer pagesNumber;
    private String reviewer;

    public Report(
        Integer textLength,
        Integer pagesNumber,
        String reviewer
    ) {
        this.textLength = textLength;
        this.pagesNumber = pagesNumber;
        this.reviewer = reviewer;
    }
}
