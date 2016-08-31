package ar.fiuba.tdd.tp0;

/**
 * Created by luciano on 30/08/16.
 */
public abstract class Node<T> {

    protected T value; //Saves value of node
    protected Node nextElement; //Reference to next element


    //Links node to next one
    public abstract void link(Node nextNode);

    //Adds item to node
    public abstract void fill(T item);

    //Returns value
    public abstract T value() ;

    //Returns next element
    public abstract Node next() ;

    //Returns if is last element
    public abstract Boolean isLast();

    //Returns size of node
    public abstract int size();

    //Returns sum of sizes from this node to the ones that follow.
    public abstract int sumOfSizes();
}



