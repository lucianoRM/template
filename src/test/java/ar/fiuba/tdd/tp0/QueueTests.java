package ar.fiuba.tdd.tp0;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by luciano on 30/08/16.
 */
public class QueueTests {

    @Test
    public void testInitialSizeZeroOK() {
        assertEquals(new LinkedQueue<Integer>().size(), 0);
    }

    @Test
    public void testInitialSizeNot1() {
        assertNotEquals(new LinkedQueue<Integer>().size(), 1);
    }

    @Test
    public void testAddElementSizeis1() {
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        queue.add(1);
        assertEquals(queue.size(), 1);
    }

    @Test
    public void testAddAndGetElement() {
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        queue.add(1);
        assertEquals(queue.top().intValue(), 1);

    }

    @Test
    public void testAddAndGetMultipleElements() {

        LinkedQueue<Integer> queue = new LinkedQueue<>();

        for (int i = 0;i < 100;i++) {
            queue.add(i);
        }
        for (int i = 99;i >= 0;i--) {
            assertEquals(queue.top().intValue(), i);
            queue.remove();
        }

    }

    @Test(expected = EmptyNodeError.class)
    public void testGetTopFromEmptyQueueRaisesException() {

        LinkedQueue<Integer> queue = new LinkedQueue<>();
        queue.top();


    }

    @Test(expected = EmptyNodeError.class)
    public void testRemoveFromEmptyQueueRaisesException() {
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        queue.remove();
    }


    @Test
    public void testAddOneRemoveAndGetSize() {
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        queue.add(1);
        queue.remove();
        assertEquals(queue.size(),0);
    }

    @Test
    public void testAddFourAndGetSize() {
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        assertEquals(queue.size(),4);
    }

}
