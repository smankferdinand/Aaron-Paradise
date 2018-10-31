/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;

/**
 *
 * @author Rafael.M
 */
public class HarvestCrops {

    public static int CalculateHarvest(int wheats, int tithes) {

        int percentage = 0;
        if(tithes < 0) 
            return - 1; 
        if(wheats < 0)
            return -2;
        if (tithes > 12) {
            percentage = Randoms(2, 5);
        } else if (tithes >= 8 & tithes <= 12) {
            percentage = Randoms(2, 4);
        } else {
            percentage = Randoms(1, 3);
        }
        int amount = (percentage * wheats) / 100;

        return amount;
    }

    private static int Randoms(int k, int k0) {
        return ((k + k0));
    }
}
