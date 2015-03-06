package dcll.lble.MySimpleStack;

import junit.framework.TestCase;

public class SimpleStackImplTest extends TestCase {


    public void testIsEmpty() throws Exception {
        SimpleStackImpl cartTest = new SimpleStackImpl();
        assertTrue(cartTest.isEmpty());
        cartTest.push(new Item("Test"));
        assertFalse(cartTest.isEmpty());
    }

    public void testGetSize() throws Exception {
        SimpleStackImpl cartTest = new SimpleStackImpl();
        assertTrue(cartTest.getSize() == 0);
    }

    public void testPush() throws Exception {
        SimpleStackImpl cartTest = new SimpleStackImpl();
        cartTest.push(new Item("Test"));
        assertTrue(cartTest.getSize() == 1);
    }

    public void testPeek() throws Exception {
        SimpleStackImpl cartTest = new SimpleStackImpl();
        Item test = new Item("Test");
        cartTest.push(test);
        assertTrue(cartTest.peek().getNom().equals(test.getNom()));
        assertTrue(cartTest.getSize() == 1);
    }

    public void testPop() throws Exception {
        SimpleStackImpl cartTest = new SimpleStackImpl();
        Item test = new Item("Test");
        cartTest.push(test);
        assertTrue(cartTest.pop().equals(test));
        assertTrue(cartTest.getSize() == 0);
    }
}