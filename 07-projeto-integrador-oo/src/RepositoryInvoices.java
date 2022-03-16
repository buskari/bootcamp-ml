import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RepositoryInvoices implements Operations<Invoice> {
    private ArrayList<Invoice> invoices = new ArrayList();

    @Override
    public void add(Invoice object) {
        invoices.add(object);
        System.out.println("Invoice added successfully");
    }

    @Override
    public Invoice read(String ClientId) throws Exception {
        for (Invoice invoice : invoices) {
            if (invoice.getCliente().getId().equals(ClientId)) {
                return invoice;
            }
        }
        throw new Exception("Invoice doest not exists");
    }

    @Override
    public void update(Invoice object, String id) {
        for (Invoice invoice : invoices) {
            if (invoice.getCliente().getId().equals(id)) {
                invoice = object;
            }
        }
        System.out.println("Invoice updated successfully");
    }

    @Override
    public void delete(String id) throws Exception {
        invoices.removeIf(invoice -> invoice.getCliente().getId().equals(id));
        throw new Exception("Invoice does not exists");
    }
}
