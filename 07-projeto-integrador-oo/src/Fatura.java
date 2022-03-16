import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Fatura {
    private Cliente cliente;
    private List<Item> itens;
    private BigDecimal total;
}
