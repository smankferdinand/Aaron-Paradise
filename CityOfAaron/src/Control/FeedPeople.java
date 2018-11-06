/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author David Carsin
 */
public class FeedPeople {
    public static int CalculateHarvest(int bushels, int wheatInStorage) {
        int leftWheat = 0;
        if (bushels < 0)
            return -1;
        if ((wheatInStorage -  bushels) < 0) {
            return -2;
        } else {
            wheatInStorage -= bushels;
        }
        return wheatInStorage;
    }
}
