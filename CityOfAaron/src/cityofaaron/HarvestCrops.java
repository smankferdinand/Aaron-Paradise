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

    public static int CalculateHarvest(int sort, int tithes) {

        int percentage = 0;

        if (sort > 12) {
            percentage = Random(2, 5);
        } else if (sort >= 8 & sort <= 12) {
            percentage = Random(2, 4);
        } else {
            percentage = Random(1, 3);
        }
        tithes = (percentage) / 100;

        return tithes;
    }

    private static int Random(int j, int j0) {
        return ((j + j0) / 2);
    }
}
