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
     
        /*
        /////////////////////////////////////
        TEST CASE # 1
        /////////////////////////////////////
        */
        System.out.println("\tTes number 01");
        //input for users 
        int rnd = 50;
        int wheat = 5500;
        // create instance 
      //  ControlLayer  newlayer = new ControlLayer();
        // expected output 
        int expResult = 440;
        // call the function 
        int result = ControlLayer.wheatRatEaten(rnd,wheat);
        
        
        
        /*
        /////////////////////////////////////
        TEST CASE # 2
        /////////////////////////////////////
        */
        System.out.println("\tTes number 02");
        //input for users 
         rnd = 25;
         wheat = 4700;
        // create instance 
     
        // expected output 
         expResult = 376;
        // call the function 
         result = ControlLayer.wheatRatEaten(rnd,wheat);
        
        
        /*
        /////////////////////////////////////
        TEST CASE # 3
        /////////////////////////////////////
        */
        System.out.println("\tTes number 03");
        //input for users 
         rnd = 60;
         wheat = 3400;
        // create instance 
   
        // expected output 
         expResult = 272;
        // call the function 
         result = ControlLayer.wheatRatEaten(rnd,wheat);
        
        /*
        /////////////////////////////////////
        TEST CASE # 4
        /////////////////////////////////////
        */
        System.out.println("\tTes number 04");
        //input for users 
         rnd = 30;
         wheat = 2900;
        // create instance 
   
        // expected output 
         expResult = 232;
        // call the function 
         result = ControlLayer.wheatRatEaten(rnd,wheat); 
         
         
           /*
        /////////////////////////////////////
        TEST CASE # 5
        /////////////////////////////////////
        */
        System.out.println("\tTes number 05");
        //input for users 
         rnd = 4;
         wheat = 8450;
        // create instance 
   
        // expected output 
         expResult = 676;
        // call the function 
         result = ControlLayer.wheatRatEaten(rnd,wheat); 
      
         
         
                /*
        /////////////////////////////////////
        TEST CASE # 6
        /////////////////////////////////////
        */
        System.out.println("\tTes number 06");
        //input for users 
         rnd = 0;
         wheat = -10;
        // create instance 
   
        // expected output 
         expResult = 0;
        // call the function 
         result = ControlLayer.wheatRatEaten(rnd,wheat); 
         
         
         
                  /*
        /////////////////////////////////////
        TEST CASE # 7
        /////////////////////////////////////
        */
        System.out.println("\tTes number 07");
        //input for users 
         rnd = 0;
         wheat = -45120;
        // create instance 
   
        // expected output 
         expResult = -3609;
        // call the function 
         result = ControlLayer.wheatRatEaten(rnd,wheat); 
    }
    
    
}
