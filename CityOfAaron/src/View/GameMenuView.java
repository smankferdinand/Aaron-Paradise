/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Game;
import java.util.Scanner;

/**
 *
 * @author SG0206641
 */
public class GameMenuView {

    public GameMenuView() {
    }
//l for listo of items
//list of locations visited
// 
//        move
//        ask location to move
//        ask for map simbol
                
                
                
                
    public void display() {
        boolean done = false;
        do {
            System.out.println("V - View the map\n "
                            + "M - Move to a new location\n"
                            + "C - Manage the Crops\n "
                            + "L - Live the Year\n"
                            + "R - Reports Menu\n "
                            + "S - Save Game\n"   
                            +"B-Buy Land\n" 
                            +"W-Ware House\n"
                            + "E - Return to the Main Menu\n");
            String input = getInput();
            done = doAction(input);
        } while (!done);
    }

    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        return choice;
    }
    
    public boolean doAction(String input) {
        input = input.toUpperCase();
        switch (input) {
            case "E":
                System.out.println("Returning to Main Menu...");
                return true;
            case "M":
                newLocation();
                break;
            case "C":
                manageCrops();
                break;
            case "L":
                liveYear();
                break;
            case "R":
                reportMenu();
                break;
            case "S":
                saveGame();
                break;
            case "B":
                BuyLand();
                break;
             case "W":
                WareHouse();
                break;
            default:
                System.out.println("Invalid option, please try again...");
        }
        return false;
    }

    public void newLocation() {
        System.out.println("You selected New Location...");
        NewLocationView newLoc = new NewLocationView();
        newLoc.display();
    }
    
    public void manageCrops() {
        System.out.println("You selected Manage Crops...");
        ManageCropsView Manacrop = new ManageCropsView();
        Manacrop.display();
    }
        
    public void liveYear() {
        System.out.println("You selected Live Year...");
        LiveYearsView LivYear = new LiveYearsView();
        LivYear.display();
    }
    
    public void reportMenu() {
        System.out.println("You selected Report Menu...");
        ReportMenuView report = new ReportMenuView();
        report.display();
    }
    
    public void saveGame() {
        System.out.println("You selected Save Game...");
    }
    
    public void WareHouse() {
        System.out.println("You selected Buy land...");
        BuyLandView buyland = new BuyLandView();
        buyland.display();
}
    public void BuyLand() {
        System.out.println("You selected Ware House...");
        WareHouseView warehouse = new  WareHouseView();
        warehouse.display();
}
}