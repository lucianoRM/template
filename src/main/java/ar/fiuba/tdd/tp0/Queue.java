package ar.fiuba.tdd.tp0;

/**
 * Created by luciano on 30/08/16.
 */
public interface Queue<T> {

    boolean isEmpty();

    int size();

    void add(T item) ; //Add new item

    T top() ; //Return first item, raise exception if empty

    void remove() ; //Remove first item raise exception if empty



}
