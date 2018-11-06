/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Rafael.M
 */
public class HarvestCrops {

    public static int CalculateHarvest(int wheats, int cropYield) {
        int grouth = 0;
        if (cropYield > 12) {
            grouth = (100 + Randoms(2, 5))/100;
        } else if (cropYield >= 8 & cropYield <= 12) {
            grouth = (100 + Randoms(2, 4))/100;
        } else {
            grouth = (100 + Randoms(1, 3))/100;
        }
        wheats *= grouth;
        return wheats;
    }

    private static int Randoms(int k, int k0) {
        return ((k + k0));
    }
}
