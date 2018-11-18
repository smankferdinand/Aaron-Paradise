/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


/**
 *
 * @author SG0206641
 */
public abstract class GameMenuView extends View {

    public GameMenuView() {
        super("V - View the map\n"
                + "M - Move to a new location\n"
                + "C - Manage the Crops\n"
                + "L - Live the Year\n"
                + "R - Reports Menu\n"
                + "S - Save Game\n"
                + "B - Buy Land\n"
                + "W - Ware House\n"
                + "E - Return to the Main Menu\n");
    }
    
    @Override
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
        //NewLocationView newLoc = new NewLocationView();
        //newLoc.display();
    }

    public void manageCrops() {
        System.out.println("You selected Manage Crops...");
        //ManageCropsView Manacrop = new ManageCropsView();
        //Manacrop.display();
    }

    public void liveYear() {
        System.out.println("You selected Live Year...");
        //LiveYearsView LivYear = new LiveYearsView();
        //LivYear.display();
    }

    public void reportMenu() {
        System.out.println("You selected Report Menu...");
        //ReportMenuView report = new ReportMenuView();
        //report.display();
    }

    public void saveGame() {
        System.out.println("You selected Save Game...");
    }

    public void BuyLand() {
        System.out.println("You selected Buy land...");
        //BuyLandView buyLand = new BuyLandView();
        //buyLand.display();
    }

    public void WareHouse() {
        System.out.println("You selected Ware House...");
        //WareHouseView wareHouse = new  WareHouseView();
        //wareHouse.display();
    }

}
