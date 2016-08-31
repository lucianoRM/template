package ar.fiuba.tdd.tp0;


/**
 * Created by luciano on 30/08/16.
 */
public class LinkedList<T> {

    private Node<T> root = new EmptyNode<>();

    public LinkedList() { }


    public boolean isEmpty() {
        return (this.size() == 0);
    }

    public int size() {
        return this.root.sumOfSizes();
    }

    public void pushFirst(T item)  {
        this.root = new FilledNode<T>(item,this.root);
    } //Add new item

    public T getFirst()  {
        return root.value();
    } //Return first item, raise exception if empty

    public void popFirst() {
        this.root = this.root.next();
    } //Remove first item raise exception if empty


}
