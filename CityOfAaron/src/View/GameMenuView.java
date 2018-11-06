/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Game;

/**
 *
 * @author SG0206641
 */
public class GameMenuView {

    public GameMenuView() {
    }
        public void display() {
        System.out.println("1 - View the map\n 2 - Move to a new location\n"
                            +" 3 - Manage the Crops\n 4 - Live the Year\n"
                            +" 5 - Reports Menu\n 6 - Save Game\n"
                            +" 7 - Return to the Main Menu\n");
    }
}
