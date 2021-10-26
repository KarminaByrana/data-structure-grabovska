import com.luxoft.datastructure.queue.ArrayQueue;
import org.junit.Test;
import static org.junit.Assert.*;



public class TestArrayQueue {


    @Test
    public void testIsEmptyTrue () {
//        prepare
        ArrayQueue arrayQueue = new ArrayQueue();
//        when
assertTrue(arrayQueue.isEmpty());
//        then
    }

    @Test
    public void testCorrectEnqueue (){
        ArrayQueue arrayQueue = new ArrayQueue ();
        arrayQueue.enqueue("34");
        arrayQueue.enqueue("2");
        assertEquals(2, arrayQueue.size());

    }
    @Test
    public void testCorrectEnqueueAndDequeue (){
        ArrayQueue arrayQueue = new ArrayQueue ();
        arrayQueue.enqueue("34");
        arrayQueue.enqueue("jnj");
        assertEquals(2, arrayQueue.size());
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        assertEquals(0, arrayQueue.size());

    }
    @Test
    public void testPeek (){
        ArrayQueue arrayQueue = new ArrayQueue ();
        arrayQueue.enqueue("34");
        arrayQueue.enqueue("15");
        assertEquals("34", arrayQueue.peek());
    }
    @Test
    public void testSize () {
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue("34");
        arrayQueue.enqueue("15");
        arrayQueue.enqueue("36");
        arrayQueue.enqueue("F");
        assertEquals(4, arrayQueue.size());
    }
    @Test
    public void testIsQueueContaines () {
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue("34");
        arrayQueue.enqueue("15");
        arrayQueue.enqueue("36");
        arrayQueue.enqueue("5");
        assertTrue(arrayQueue.contains("5"));
    }
    @Test
    public void testClear (){
        ArrayQueue arrayQueue = new ArrayQueue ();
        arrayQueue.enqueue("34");
        arrayQueue.enqueue("36");
        arrayQueue.enqueue("38");
        arrayQueue.clear();
        assertTrue(arrayQueue.isEmpty());
    }
//    ArrayStack arrayStack = new ArrayStack();
//        arrayStack.push("A");
//        arrayStack.push("B");
//
//    assertEquals(2, arrayStack.size());
//    assertEquals("B", arrayStack.pop());
//    assertEquals("A", arrayStack.pop());
//    assertEquals(0, arrayStack.size());
//    assertTrue(arrayStack.isEmpty());
}
