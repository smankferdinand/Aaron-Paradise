
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author SG0206641
 */
public abstract class MainMenuView extends View {

    public MainMenuView() {
        super("*****************************************************\n"
            + "***   Welcome : Great City Of Aarom MAIN MENU     ***\n"
            + "*****************************************************\n"
            + "A - L09: Individual Assignment DAVID\n"     
            + "B - L09: Individual Assignment RAFAEL\n"
            + "C - L09: Individual Assignment Ferdinand\n"
            + "N - Start New Game\n"
            + "L - Load a Saved Game\n"
            + "H - Get Help \n"
            + "S - Save Game\n"
            + "Q - Quit or Exit\n");
    }

    @Override
    public boolean doAction(String input) {
        input = input.toUpperCase();
        switch (input) {
            case "C":
                WaterStub  waterStub = new WaterStub() {};
                waterStub.display();
                return true;
            case "B":
                CropsStub  newStub = new CropsStub() {};
                newStub.display();
                return true;
            case "A":
                ControlStub  newControl = new ControlStub() {};
                newControl.display();
                return true;
            case "Q":
                System.out.println("Thanks for playing...");
                return true;
            case "N":
                startNewGame();
                break;
            case "H":
                helpGame();
                break;
            case "L":
                loadGame();
                break;
            case "S":
                saveGame();
                break;
            default:
                System.out.println("Invalid option, please try again...");
        }
        return false;
    }

    private void helpGame() {
        System.out.println("You have called option H for Help...");
        HelpMenuView help = new HelpMenuView() {};
        help.display();
    }

    private void startNewGame() {
        System.out.println("You have called option N for New Game...");

        // Prompt for and get the user's name
        String name;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type in your first name: ");
        name = keyboard.nextLine();

        // Display a welcome message
        System.out.println("Welcome " + name + ". Have fun playing.");

        //show the game menu
        GameMenuView gmv = new GameMenuView() {};
        gmv.display();
    }

    private void loadGame() {
        System.out.println("You have called option L for Load Game...");
    }

    private void saveGame() {
        System.out.println("You have called option S to Save Game...");
    }

}
