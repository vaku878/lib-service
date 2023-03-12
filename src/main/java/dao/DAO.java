package dao;

public interface DAO <T>{
    int create(T t);
    T read(int id);
    int update(T t);
    int delete(T t);
}
