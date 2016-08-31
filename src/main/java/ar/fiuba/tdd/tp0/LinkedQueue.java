package ar.fiuba.tdd.tp0;

/**
 * Created by luciano on 30/08/16.
 */
public class LinkedQueue<T> implements Queue<T> {


    private LinkedList<T> list = new LinkedList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void add(T item) {
        list.pushFirst(item);
    } //Add new item

    public T top()  {
        return list.getFirst();
    } //Return first item, raise exception if empty

    public void remove() {
        list.popFirst();
    } //Remove first item raise exception if empty




}
