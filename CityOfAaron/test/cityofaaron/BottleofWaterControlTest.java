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
 * @author Smank Ferdinand
 */
public class BottleofWaterControlTest {
    public BottleofWaterControlTest() {
    }

    /**
     * Test of watertaken method, of class BottleofWaterControl.
     */
    @Test
    public void testWatertaken() {
        System.out.println("watertaken");
        int rnd = 5;
        int water = 250;
        int expResult = 0;
        int result = BottleofWaterControl.watertaken(rnd, water);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}






 
