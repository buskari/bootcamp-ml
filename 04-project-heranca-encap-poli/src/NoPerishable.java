public class NoPerishable extends Product{
    private String type;

    public NoPerishable(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    @Override
    public String toString() {
        return "NoPerishable{" +
                "type='" + type + '\'' +
                '}';
    }
}
