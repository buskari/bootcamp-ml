package exercicio2;

public class Report extends Document {
    private Integer textLength;
    private Integer pagesNumber;
    private String reviewer;

    public Report(
        Integer textLength,
        Integer pagesNumber,
        String reviewer
    ) {
        super(DocType.REPORT);
        this.textLength = textLength;
        this.pagesNumber = pagesNumber;
        this.reviewer = reviewer;
    }
}
