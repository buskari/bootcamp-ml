import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Invoice {
    private Client cliente;
    private List<Item> itens;
    private BigDecimal total = BigDecimal.ZERO;

    public Invoice(Client cliente, List<Item> itens) {
        this.cliente = cliente;
        this.itens = itens;
        setTotal();
    }

    public void setTotal() {
        BigDecimal quantidade;
        BigDecimal subtotal;
        for (Item item : itens) {
            quantidade = BigDecimal.valueOf((item.getQuantidade()));
            subtotal = item.getCustoUnitario().multiply(quantidade);
            this.total = this.total.add(subtotal);
        }
    }
}
