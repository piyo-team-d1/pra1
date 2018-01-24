package teamd.hello;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PiyoTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PiyoTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PiyoTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testPiyo()
    {
        assertTrue( true );
    	Piyo piyo = new Piyo();
        assertEquals("piyo",piyo.getPassword("hoge"));
        assertEquals("hoyo",piyo.getPassword("hoyoyo"));
    }
}
