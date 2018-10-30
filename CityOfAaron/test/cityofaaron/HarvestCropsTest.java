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
       
        /*
        /////////////////////////////////////
        TEST CASE # 1
        /////////////////////////////////////
        */
        System.out.println("\tTes number 01");
        //input for users 
        int wheats  = 50;
        int tithes  = 5500;
        // create instance 
      //  ControlLayer  newlayer = new ControlLayer();
        // expected output 
        int expResult = 440;
        // call the function 
        int result = HarvestCrops.CalculateHarvest(wheats,tithes);
        
        
        
        /*
        /////////////////////////////////////
        TEST CASE # 2
        /////////////////////////////////////
        */
       System.out.println("\tTes number 02");
        //input for users 
        wheats  = 50;
        tithes  = 5500;
        // create instance 
        //  ControlLayer  newlayer = new ControlLayer();
        // expected output 
         expResult = 440;
        // call the function 
         result = HarvestCrops.CalculateHarvest(wheats,tithes);
        
        
        /*
        /////////////////////////////////////
        TEST CASE # 3
        /////////////////////////////////////
        */
         System.out.println("\tTes number 03");
        //input for users 
         wheats  = 50;
         tithes  = 5500;
        // create instance 
        //  ControlLayer  newlayer = new ControlLayer();
        // expected output 
         expResult = 440;
        // call the function 
         result = HarvestCrops.CalculateHarvest(wheats,tithes);
        
        /*
        /////////////////////////////////////
        TEST CASE # 4
        /////////////////////////////////////
        */
        System.out.println("\tTes number 04");
        //input for users 
         wheats  = 50;
         tithes  = 5500;
        // create instance 
        //  ControlLayer  newlayer = new ControlLayer();
        // expected output 
         expResult = 440;
        // call the function 
         result = HarvestCrops.CalculateHarvest(wheats,tithes); 
         
         
           /*
        /////////////////////////////////////
        TEST CASE # 5
        /////////////////////////////////////
        */
         System.out.println("\tTes number 05");
        //input for users 
         wheats  = 50;
         tithes  = 5500;
        // create instance 
        //  ControlLayer  newlayer = new ControlLayer();
        // expected output 
         expResult = 440;
        // call the function 
         result = HarvestCrops.CalculateHarvest(wheats,tithes);
      
         
         
                /*
        /////////////////////////////////////
        TEST CASE # 6
        /////////////////////////////////////
        */
        System.out.println("\tTes number 06");
        //input for users 
         wheats  = 50;
         tithes  = 5500;
        // create instance 
      //  ControlLayer  newlayer = new ControlLayer();
        // expected output 
         expResult = 440;
        // call the function 
        result = HarvestCrops.CalculateHarvest(wheats,tithes);
         
         
         
                  /*
        /////////////////////////////////////
        TEST CASE # 7
        /////////////////////////////////////
        */
         System.out.println("\tTes number 07");
        //input for users 
         wheats  = 50;
         tithes  = 5500;
        // create instance 
        //  ControlLayer  newlayer = new ControlLayer();
        // expected output 
         expResult = 440;
        // call the function 
        result = HarvestCrops.CalculateHarvest(wheats,tithes);
    }
    
}
