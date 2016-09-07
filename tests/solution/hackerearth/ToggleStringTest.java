package solution.hackerearth;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by srivacha on 07/09/2016.
 */
public class ToggleStringTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testToggleString() {
        assertTrue("Kaput!!", "ABC".equals(ToggleString.doToggle("abc")));
        assertTrue("Kaput!!", "xyz".equals(ToggleString.doToggle("XYZ")));
        assertTrue("Kaput!!", "aBc".equals(ToggleString.doToggle("AbC")));
        assertTrue("Kaput!!", "aBc".equals(ToggleString.doToggle("AbC")));
        assertTrue("Kaput!!", "aBcDeFgHiJkLmNoPqRsTuVwXyZ".equals(ToggleString.doToggle("AbCdEfGhIjKlMnOpQrStUvWxYz")));
        assertTrue("Kaput!!", "AbCdEfGhIjKlMnOpQrStUvWxYz".equals(ToggleString.doToggle("aBcDeFgHiJkLmNoPqRsTuVwXyZ")));
    }

}