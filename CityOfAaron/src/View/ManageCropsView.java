/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author Rafael.M
 */
public abstract class ManageCropsView extends View{

    public ManageCropsView() {
    }

    public void display() {
        boolean done = false;
        do {
            System.out.println("\nPlease select option Crop menu needed:\n"
                    + "V - View Current Percentages of Crop\n"
                    + "F - Move to a Field\n"
                    + "M - Manage amount of wheat\n"
                    + "T - Total Amount of Wheat\n"
                    + "R - Reports of the crops \n"
                    + "S - Save Game\n"
                    + "Q - Return to the Last Menu\n");
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
            case "Q":
                System.out.println("Returning to previous Menu..");
                return true;
            case "V":
                ViewCurrentPercentagesofCrop();
                break;
            case "F":
                MovetoaField();
                break;
            case "M":
                ManageAmountofWheat();
                break;
            case "T":
                TotalAmountofWheat();
                break;
            case "R":
                ReportsOftheCrops();
                break;
            case "S":
                SaveGame();
                break;
            default:
                System.out.println("Invalid option, please try again...");
        }
        return false;
    }

    private void ViewCurrentPercentagesofCrop() {
        System.out.println("How many crops do you think have you?, You can use this \"V\" option,\n"
                + " to control all your crop.  ");
    }

    private void MovetoaField() {
        System.out.println("Please, use this \"F\" option to move into your fields and,\n"
                + " verify where are you?");
    }

    private void ManageAmountofWheat() {
        System.out.println("Please, use this \"M\" option to verify the amount of your Wheat,\n"
                + " and be ready to use it to feed the people or sell. ");
    }

    private void TotalAmountofWheat() {
        System.out.println("Do you know how many wheat do you have after the collected your crop?\n"
                + " so please, use this \"T\" option to view the total amount of your wheat,\n"
                + " and try to sell and exchange for new resources. Good luck !!!");
    }

    private void ReportsOftheCrops() {
        System.out.println("Do you want to view the statistics of your crop monthly?\n"
                + " Please use this \"R\" option for verifying the production monthly,\n"
                + " and view the resources you have through your crop. ");
    }

    private void SaveGame() {
        System.out.println("Use this \"S\" option for keeping your game into somewhere :)");
    }

}
