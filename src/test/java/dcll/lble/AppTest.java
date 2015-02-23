package dcll.lble;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */

    public void testApp(){assertTrue(true);}

    public void testNom()
    {
        Item item1 = new Item("Test");
        assertTrue(item1.nom.equals("Test"));
    }

    public void testIsEmptyTrue()
    {
        SimpleStackImpl cartTest = new SimpleStackImpl();
        assertTrue(cartTest.isEmpty());
    }

    public void testIsEmptyFalse()
    {
        SimpleStackImpl cartTest = new SimpleStackImpl();
        cartTest.push(new Item("Test"));
        assertFalse(cartTest.isEmpty());
    }

    public void testGetSize()
    {
        SimpleStackImpl cartTest = new SimpleStackImpl();
        assertTrue(cartTest.getSize() == 0);
    }

    public void testPush()
    {
        SimpleStackImpl cartTest = new SimpleStackImpl();
        cartTest.push(new Item("Test"));
        assertTrue(cartTest.getSize() == 1);
    }

    public void testPeek() throws EmptyStackException {
        SimpleStackImpl cartTest = new SimpleStackImpl();
        Item test = new Item("Test");
        cartTest.push(test);
        assertTrue(cartTest.peek().equals(test));
        assertTrue(cartTest.getSize() == 1);
    }

    public void testPop() throws EmptyStackException {
        SimpleStackImpl cartTest = new SimpleStackImpl();
        Item test = new Item("Test");
        cartTest.push(test);
        assertTrue(cartTest.pop().equals(test));
        assertTrue(cartTest.getSize() == 0);
    }

}
