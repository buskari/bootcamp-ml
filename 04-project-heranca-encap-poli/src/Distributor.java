import java.util.ArrayList;
import java.util.Arrays;

public class Distributor {
    public Distributor() {
    }

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        Product arroz = new Perishable("arroz", 4.90, 30);
        Product feijao = new Perishable("feijao", 7.90, 1);
        Product ovo = new Perishable("ovos caipira", 9.90, 2);
        Product calca = new NoPerishable("calça jeans", 59.90, "vestuário");
        Product caderno = new NoPerishable("caderno universitário", 19.90, "papelaria");

        products.add(arroz);
        products.add(feijao);
        products.add(ovo);
        products.add(calca);
        products.add(caderno);
    }
}
