package Test45min.sessoin16;

import java.util.List;

public interface IRepository<T> {
    boolean add(T item);
    boolean  removeByid(String id);
    T findByid(String id);
    List<T> findAll();

}


