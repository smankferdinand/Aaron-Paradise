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
public class HarvestCropsTest {
    
    public HarvestCropsTest() {
    }

    /**
     * Test of CalculateHarvest method, of class HarvestCrops.
     */
    @Test
    public void testCalculateHarvest() {
        System.out.println("CalculateHarvest");
        int sort = 5;
        int tithes = 50;
        int expResult = 0;
        int result = HarvestCrops.CalculateHarvest(sort, tithes);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
