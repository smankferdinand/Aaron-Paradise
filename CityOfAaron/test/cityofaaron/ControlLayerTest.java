/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rafael.M
 */
public class ControlLayerTest {
    
    public ControlLayerTest() {
    }

    /**
     * Test of wheatRatEaten method, of class ControlLayer.
     */
    @Test
    public void testWheatRatEaten() {
        System.out.println("wheatRatEaten");
        int rnd = 0;
        int wheat = 0;
        int expResult = 0;
        int result = ControlLayer.wheatRatEaten(rnd, wheat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
