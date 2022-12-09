package entity;

import java.util.ArrayList;

public interface Handle <T>{

    T insert();
    T delete(T object, ArrayList<T> list);
    T update(T object, ArrayList<T> list);

}
