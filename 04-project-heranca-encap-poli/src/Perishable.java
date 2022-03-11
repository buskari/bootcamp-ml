public class Perishable extends Product{
    private int daysToExpire;

    public Perishable(String name, double price, int daysToExpire) {
        super(name, price);
        this.daysToExpire = daysToExpire;
    }

    public void setDaysToExpire(int daysToExpire) {
        this.daysToExpire = daysToExpire;
    }

    public int getDaysToExpire() {
        return daysToExpire;
    }

    @Override
    public String toString() {
        return "Perishable{" +
                "daysToExpire=" + daysToExpire +
                '}';
    }

    @Override
    public double calculate(int quantity) {
        double finalPrice = this.getPrice() * quantity;

        if (daysToExpire == 1) {
            return finalPrice / 4;
        } else if (daysToExpire == 2) {
            return finalPrice / 3;
        } else {
            return finalPrice / 2;
        }
    }
}
