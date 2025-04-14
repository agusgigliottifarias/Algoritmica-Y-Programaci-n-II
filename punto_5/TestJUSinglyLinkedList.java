package punto_5;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestJUSinglyLinkedList {
    private SinglyLinkedList<String> list;

    @Before
    public void setUp() {
        list = new SinglyLinkedList<>();
        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
    }

    @Test
    public void testAddPos() {
        list.addPos("x", 1);
        assertEquals("->a->x->b->c", list.toString());
    }

    @Test
    public void testRemoveElementFound() {
        String removed = list.removeElement("b");
        assertEquals("b", removed);
        assertEquals("->a->c", list.toString());
    }

    @Test
    public void testRemoveElementNotFound() {
        String removed = list.removeElement("z");
        assertNull(removed);
        assertEquals("->a->b->c", list.toString());
    }

    @Test
    public void testRemovePosValid() {
        String removed = list.removePos(1);
        assertEquals("b", removed);
        assertEquals("->a->c", list.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemovePosInvalid() {
        list.removePos(10);
    }

    @Test
    public void testConcatenate() {
        SinglyLinkedList<String> other = new SinglyLinkedList<>();
        other.addLast("x");
        other.addLast("y");
        list.concatenate(other);
        assertEquals("->a->b->c->x->y", list.toString());
    }

    @Test
    public void testSearchFound() {
        assertEquals("b", list.search("b"));
    }

    @Test
    public void testSearchNotFound() {
        assertNull(list.search("z"));
    }
}
