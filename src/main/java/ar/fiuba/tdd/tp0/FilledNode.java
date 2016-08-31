package ar.fiuba.tdd.tp0;

/**
 * Created by luciano on 30/08/16.
 */
public class FilledNode<T> extends Node<T> {




    public FilledNode(T newValue,Node next) {
        this.value = newValue;
        this.nextElement = next;
    }

    //Links node to next one
    public void link(Node nextNode) {
        this.nextElement = nextNode;
    }

    //Adds item to node
    public void fill(T item) {
        this.value = item;
    }

    //Returns value
    public T value() {
        return value;
    }

    //Returns next element
    public Node next() {
        return this.nextElement;
    }

    //Returns if is last element
    public Boolean isLast() {
        return (this.value == null);
    }

    //Returns size of node
    public int size() {
        return 1;
    }

    //Returns sum of sizes from this node to the ones that follow.
    public int sumOfSizes() {
        return this.size() + this.nextElement.sumOfSizes();
    }
}
