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
 * @author dcars
 */
public class FeedPeopleTest {
    
    public FeedPeopleTest() {
    }

    /**
     * Test of CalculateHarvest method, of class FeedPeople.
     */
    @Test
    public void testCalculateHarvest() {
        System.out.println("CalculateHarvest");
        
        /*/////////////////////////////////////
        TEST CASE # 1
        /////////////////////////////////////*/
        System.out.println("\tTest case 1");                
        int bushels = 0;
        int wheatInStorage = 0;
        int expResult = 0;
        int result = FeedPeople.CalculateHarvest(bushels, wheatInStorage);
        
        /*/////////////////////////////////////
        TEST CASE # 2
        /////////////////////////////////////*/
        System.out.println("\tTest case 2");                
        bushels = 1;
        wheatInStorage = 0;
        expResult = -2;
        result = FeedPeople.CalculateHarvest(bushels, wheatInStorage);
        
        /*/////////////////////////////////////
        TEST CASE # 3
        /////////////////////////////////////*/
        System.out.println("\tTest case 3");                
        bushels = -10;
        wheatInStorage = 0;
        expResult = -1;
        result = FeedPeople.CalculateHarvest(bushels, wheatInStorage);
        
        /*/////////////////////////////////////
        TEST CASE # 4
        /////////////////////////////////////*/
        System.out.println("\tTest case 4");                
        bushels = 10;
        wheatInStorage = 10;
        expResult = 0;
        result = FeedPeople.CalculateHarvest(bushels, wheatInStorage);
        
        /*/////////////////////////////////////
        TEST CASE # 5
        /////////////////////////////////////*/
        System.out.println("\tTest case 5");                
        bushels = 10;
        wheatInStorage = 100;
        expResult = 90;
        result = FeedPeople.CalculateHarvest(bushels, wheatInStorage);
        
        /*/////////////////////////////////////
        TEST CASE # 6
        /////////////////////////////////////*/
        System.out.println("\tTest case 01");                
        bushels = 200;
        wheatInStorage = 199;
        expResult = -2;
        result = FeedPeople.CalculateHarvest(bushels, wheatInStorage);
        
        /*/////////////////////////////////////
        TEST CASE # 7
        /////////////////////////////////////*/
        System.out.println("\tTest case 7");                
        bushels = 50;
        wheatInStorage = 100;
        expResult = 50;
        result = FeedPeople.CalculateHarvest(bushels, wheatInStorage);
        
        
        System.out.println(bushels);
        System.out.println(wheatInStorage);
        System.out.println(result);
    }
    
}
