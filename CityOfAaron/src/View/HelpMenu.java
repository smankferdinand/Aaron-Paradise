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
public class HelpMenu {

    public HelpMenu() {
    }

    public void display() {
        boolean done = false;
        do {
            System.out.println("\nPlease select option HELP needed:\n"
                    + "G - What is the goal of the game?\n"
                    + "M - How to move\n"
                    + "E - Estimate the number of resources\n"
                    + "H - Harvest resources\n"
                    + "D - Delivering resources to warehouse\n"
                    + "Q - Quit\n");
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
                System.out.println("Thanks for playing...");
                return true;
            case "G":
                goalGame();
                break;
            case "M":
                moveGame();
                break;
            case "E":
                estimateGame();
                break;
            case "H":
                harvestGame();
                break;
            case "D":
                DeliveringGame();
                break;
            default:
                System.out.println("Invalid option, please try again...");
        }
        return false;
    }

    private void goalGame() {
        System.out.println("To know the goals of the game, the user have to start the playing the game,\n "
                + "as the user proceeds forth, he/she will get the know the actual goal of the game.\n");
    }

    private void moveGame() {
        System.out.println("-	To move to another location, the user have to press ctrl+ L, \n"
                + "to refer to the map, the screen will pop with direction how on to locate, \n "
                + "and move to some areas in the map.");
    }

    private void estimateGame() {
        System.out.println("To verify the number of resources that you gaining during your session,\n"
                + "press ¨E¨ option, so you can check your all the resource that you keep it.\n"
                + "The game displing the list of the resource and suggestion you when you can use,\n"
                + "keep and remove from your match and so on. Let play´s");
    }

    private void harvestGame() {
        System.out.println("To Verify the Harvest resource please press the keyword ¨H¨,\n"
                + "and displaying the amount of the Harvest you have it on the game,\n"
                + "also displaying the list options if you want to give, crop, feed,\n"
                + "and borrow to another player.");
    }

    private void DeliveringGame() {
        System.out.println("To return to the main menu, the user has to press Ctrl + D,\n"
                + "Doing so, a screen will pop with an option \"Yes or No\",\n"
                + "asking the user if truly he/she wants to return back to\n"
                + "the main menu, if not the user will continue the game. ");
    }
}
