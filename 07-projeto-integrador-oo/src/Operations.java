public interface Operations<Type> {

    void add(Type object);
    Type read(String id) throws Exception;
    void update(Type object, String id);
    void delete(String id) throws Exception;
}