import java.util.ArrayList;

public class RepositoryItens implements Operations<Item> {
    private ArrayList<Item> itens = new ArrayList();
    @Override
    public void add(Item object) {
        itens.add(object);
        System.out.println("Invoice added successfully");
    }

    @Override
    public Item read(String id) throws Exception {
        for (Item item : itens) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        throw new Exception("Invoice doest not exists");
    }

    @Override
    public void update(Item object, String id) {
        for (Item item : itens) {
            if (item.getId().equals(id)) {
                item = object;
            }
        }
        System.out.println("Invoice updated successfully");
    }

    @Override
    public void delete(String id) throws Exception {
        itens.removeIf(item -> item.getId().equals(id));
        throw new Exception("Invoice does not exists");
    }
}
