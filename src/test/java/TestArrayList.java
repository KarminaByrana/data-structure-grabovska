import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class TestArrayList {
    @Test
    public void testAddOneMoreElementAndSize() {
        ArrayList arrayList = new ArrayList();

        arrayList.add("German Shepherd");
        arrayList.add("Border Collie");
        arrayList.add("American Staffordshire Terrier");
        assertEquals(3, arrayList.size());

    }

    @Test
    public void testAddByIndex() {

        ArrayList arrayList = new ArrayList();
        arrayList.add("German Shepherd");
        arrayList.add("Border Collie");
        arrayList.add("American Staffordshire Terrier");
        arrayList.add(3, "Biggle Dog");
        assertEquals("Biggle Dog", arrayList.get(3));
    }

    @Test
    public void testSet() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("German Shepherd");
        arrayList.add("Border Collie");
        arrayList.add("American Staffordshire Terrier");
        arrayList.set(1, "Biggle Dog");
        assertEquals("Biggle Dog", arrayList.get(1));
    }

    @Test
    public void testClearAndIsEmptyReturnTrue() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("German Shepherd");
        arrayList.add("Border Collie");
        arrayList.add("American Staffordshire Terrier");
        arrayList.clear();
        assertEquals(0, arrayList.size());
        assertTrue(arrayList.isEmpty());
    }

    @Test
    public void testRemove() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("German Shepherd");
        arrayList.add("Border Collie");
        arrayList.add("American Staffordshire Terrier");
        arrayList.remove(1);
        assertEquals(2, arrayList.size());

    }

    @Test
    public void testContains() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("German Shepherd");
        arrayList.add("Border Collie");
        arrayList.add("American Staffordshire Terrier");

        assertTrue(arrayList.contains("American Staffordshire Terrier"));
    }
    @Test
    public void testIndexOf() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("German Shepherd");
        arrayList.add("Border Collie");
        arrayList.add("American Staffordshire Terrier");
        arrayList.add("Border Collie");

        assertEquals(1, arrayList.indexOf("Border Collie"));

    }
    @Test
    public void testLastIndexOf() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("German Shepherd");
        arrayList.add("Border Collie");
        arrayList.add("American Staffordshire Terrier");
        arrayList.add("Border Collie");

        assertEquals(3, arrayList.lastIndexOf("Border Collie"));

    }
    @Test
    public void testToString () {
        ArrayList arrayList = new ArrayList();
        arrayList.add("German Shepherd");
        arrayList.add("Border Collie");
        arrayList.add("American Staffordshire Terrier");

// [A, B, C]
        assertEquals("[German Shepherd, Border Collie, American Staffordshire Terrier]", arrayList.toString());
    }
}
