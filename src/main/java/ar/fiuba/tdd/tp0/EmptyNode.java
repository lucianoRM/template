package ar.fiuba.tdd.tp0;

/**
 * Created by luciano on 30/08/16.
 */
public class EmptyNode<T> extends Node<T> {

    public EmptyNode() {
        this.value = null;
    }

    //Adds item to node
    public void fill(T item) { }

    //Returns value
    public T value()  {
        throw new EmptyNodeError("Can't access empty Node");
    }

    //Returns next element
    public Node next()   {
        throw new EmptyNodeError("Can't access empty Node");
    }

    //Links node to next one
    public void link(Node nextNode) {
        this.nextElement = nextNode;
    }

    //Returns if is last element
    public Boolean isLast() {
        return (this.value == null);
    }

    //Returns size of node
    public int size() {
        return 0;
    }

    //Returns sum of sizes from this node to the ones that follow.
    public int sumOfSizes() {
        return this.size();
    }
}
