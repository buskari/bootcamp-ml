import java.util.ArrayList;

public class RepositoryClient implements Operations<Client> {
    private ArrayList<Client> clients = new ArrayList();
    @Override
    public void add(Client object) {
        clients.add(object);
        System.out.println("Invoice added successfully");
    }

    @Override
    public Client read(String id) throws Exception {
        for (Client client : clients) {
            if (client.getId().equals(id)) {
                return client;
            }
        }
        throw new Exception("Invoice doest not exists");
    }

    @Override
    public void update(Client object, String id) {
        for (Client client : clients) {
            if (client.getId().equals(id)) {
                client = object;
            }
        }
        System.out.println("Invoice updated successfully");
    }

    @Override
    public void delete(String id) throws Exception {
        clients.removeIf(client -> client.getId().equals(id));
        throw new Exception("Invoice does not exists");
    }
}
