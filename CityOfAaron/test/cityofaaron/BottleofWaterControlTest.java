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
        
        /*
        /////////////////////////////////////
        TEST CASE # 1
        /////////////////////////////////////
        */
        System.out.println("\tTes number 01");
        //input for users 
        int rnd = 50;
        int water = 5500;
        // create instance 
      //  BottleofWaterControl  newlayer = new BottleofWaterControl();
        // expected output 
        int expResult = 440;
        // call the function 
        int result = BottleofWaterControl.watertaken(rnd,water);
        
        
        
        /*
        /////////////////////////////////////
        TEST CASE # 2
        /////////////////////////////////////
        */
        System.out.println("\tTes number 02");
        //input for users 
         rnd = 25;
         water = 4700;
        // create instance 
     
        // expected output 
         expResult = 376;
        // call the function 
         result = BottleofWaterControl.watertaken(rnd,water);
        
        
        /*
        /////////////////////////////////////
        TEST CASE # 3
        /////////////////////////////////////
        */
        System.out.println("\tTes number 03");
        //input for users 
         rnd = 60;
         water = 3400;
        // create instance 
   
        // expected output 
         expResult = 272;
        // call the function 
         result = BottleofWaterControl.watertaken(rnd,water);
        
        /*
        /////////////////////////////////////
        TEST CASE # 4
        /////////////////////////////////////
        */
        System.out.println("\tTes number 04");
        //input for users 
         rnd = 30;
         water = 2900;
        // create instance 
   
        // expected output 
         expResult = 232;
        // call the function 
         result = BottleofWaterControl.watertaken(rnd,water);
         
         
           /*
        /////////////////////////////////////
        TEST CASE # 5
        /////////////////////////////////////
        */
        System.out.println("\tTes number 05");
        //input for users 
         rnd = 4;
         water = 8450;
        // create instance 
   
        // expected output 
         expResult = 676;
        // call the function 
         result = BottleofWaterControl.watertaken(rnd,water); 
      
         
         
                /*
        /////////////////////////////////////
        TEST CASE # 6
        /////////////////////////////////////
        */
        System.out.println("\tTes number 06");
        //input for users 
         rnd = 0;
         water = -10;
        // create instance 
   
        // expected output 
         expResult = 0;
        // call the function 
         result = BottleofWaterControl.watertaken(rnd,water); 
         
         
         
                  /*
        /////////////////////////////////////
        TEST CASE # 7
        /////////////////////////////////////
        */
        System.out.println("\tTes number 07");
        //input for users 
         rnd = 0;
         water = -45120;
        // create instance 
   
        // expected output 
         expResult = -3609;
        // call the function 
         result = BottleofWaterControl.watertaken(rnd,water); 
    }
    
    
}






 
