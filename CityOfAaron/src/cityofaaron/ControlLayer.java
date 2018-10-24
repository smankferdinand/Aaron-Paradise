package cityofaaron;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import cityofaaron.CityOfAaron;
import java.util.Random;
import newpackage.*;

/**
 *
 * @author SG0206641
 */
public class ControlLayer {

    public static int wheatRatEaten(int rnd, int wheat) {
        int eaten = wheat;
        int porcentaje = 0;
        if (rnd <= 30) {
            if (rnd > 12) {
                porcentaje = Random(3, 5);
            } else if (rnd >= 8 & rnd <= 12) {
                porcentaje = Random(3, 7);
            } else {
                porcentaje = Random(6, 10);
            }
            eaten = wheat * porcentaje / 100;
        }
        return eaten;
    }

    private static int Random(int i, int i0) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 8;
    }
}
