import com.luxoft.datastructure.list.LinkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestLinkedList {
    @Test
    public void testPeek() {
        LinkedList linkedList = new LinkedList();

        linkedList.add("34");
        linkedList.add("15");

        assertEquals("34", linkedList.peek());
    }

    @Test
    public void testAddOneMoreElementAndSize() {
        LinkedList linkedList = new LinkedList();

        linkedList.add("1German Shepherd");
        linkedList.add("2German Shepherd");
        linkedList.add("3German Shepherd");

        assertEquals(3, linkedList.size());
//        assertEquals("German Shepherd", linkedList.get(0));

    }


    @Test
    public void testSetValue() {
        LinkedList linkedList = new LinkedList();

        linkedList.add("1German Shepherd");
        linkedList.add("2German Shepherd");
        linkedList.add("3German Shepherd");

        linkedList.set("4German Shepherd", 2);

        assertEquals("4German Shepherd", linkedList.get(2));

    }

    @Test
    public void testRemove() {
        LinkedList linkedList = new LinkedList();

        linkedList.add("1German Shepherd");
        linkedList.add("2German Shepherd");
        linkedList.add("3German Shepherd");

        linkedList.remove( 2);

        assertEquals(2, linkedList.size());

    }

    @Test
    public void testGetNodeByIndex() {
        LinkedList linkedList = new LinkedList();

        linkedList.add("1German Shepherd");
        linkedList.add("2German Shepherd");
        linkedList.add("3German Shepherd");

        linkedList.getNodeByIndex(1);

        assertEquals("2German Shepherd", linkedList.get(1));
    }

    @Test
    public void testGetFirst() {
        LinkedList linkedList = new LinkedList();

        linkedList.add("1German Shepherd");
        linkedList.add("2German Shepherd");
        linkedList.add("3German Shepherd");

        assertEquals("1German Shepherd",linkedList.getFirst());
    }

    @Test
    public void testGetLast() {
        LinkedList linkedList = new LinkedList();

        linkedList.add("1German Shepherd");
        linkedList.add("2German Shepherd");
        linkedList.add("3German Shepherd");

        assertEquals("3German Shepherd",linkedList.getLast());
    }

    @Test
    public void testContains() {
        LinkedList linkedList = new LinkedList();

        linkedList.add("1German Shepherd");
        linkedList.add("2German Shepherd");
        linkedList.add("3German Shepherd");

        assertTrue(linkedList.contains("3German Shepherd"));
    }

    @Test
    public void testClearAndIsEmptyReturnsTrue() {
        LinkedList linkedList = new LinkedList();

        linkedList.add("1German Shepherd");
        linkedList.add("2German Shepherd");
        linkedList.add("3German Shepherd");

        linkedList.clear();

        assertEquals(0, linkedList.size());
        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void testIndexOf() {
        LinkedList linkedList = new LinkedList();

        linkedList.add("1German Shepherd");
        linkedList.add("2German Shepherd");
        linkedList.add("3German Shepherd");

        assertEquals(1, linkedList.indexOf("2German Shepherd"));
    }

    @Test
    public void testLastIndexOf() {
        LinkedList linkedList = new LinkedList();

        linkedList.add("1German Shepherd");
        linkedList.add("2German Shepherd");
        linkedList.add("3German Shepherd");
        linkedList.add("2German Shepherd");

        assertEquals(3, linkedList.lastIndexOf("2German Shepherd"));
    }
}