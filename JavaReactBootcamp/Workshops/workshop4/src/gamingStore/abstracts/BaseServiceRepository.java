package gamingStore.abstracts;

public interface BaseServiceRepository<T> {

    void add(T entities);

    void delete(T entities);

    void update(T entities);
}
