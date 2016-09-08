package solution.hackerearth;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Srivashdev T C on 08/09/2016.
 */
public class FindProductTest {
    @Test
    public void doProduct() throws Exception {
        int[] inputArray = {1,2,3,4,5};
        assertEquals("Unexpected Result!!", 120, FindProduct.doProduct(inputArray));

        inputArray = new int[] {1000,1000,1000,1000,1000,1000,1000,1000,1000,1000};
        assertEquals("Unexpected Result!!", 999657007, FindProduct.doProduct(inputArray));

        inputArray = new int[1000];
        for (int i = 0; i < 1000; i++) {
            inputArray[i] = 1000;
        }
        assertEquals("Unexpected Result!!", 524700271, FindProduct.doProduct(inputArray));

    }

}