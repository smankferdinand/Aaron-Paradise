/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;
import cityofaaron.CityOfAaron;
import java.util.Random;
import newpackage.*;


/**
 *
 * @author Smank Ferdinand
 * 
 */
public class BottleofWaterControl {

    private static int taken;
public static int watertaken(int rnd, int water) {
        int taken = water;
        int percentage = 0;
        if (rnd <= 30) {
            if (rnd > 12) {
                percentage = Random(3, 5);
            } else if (rnd >= 8 & rnd <= 12) {
                percentage = Random(3, 7);
            } else {
                percentage = Random(6, 10);
            }
            taken = water * percentage / 100;
        }
        return taken;
    }

    private static int Random(int i, int i0) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 8;
    }
}

