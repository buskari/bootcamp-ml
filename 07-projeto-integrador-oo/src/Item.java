import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Item {
    private String id;
    private String nome;
    private int quantidade;
    private BigDecimal custoUnitario;
}
