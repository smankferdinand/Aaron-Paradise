
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
public class MainMenu {

    public MainMenu() {
        
        
    }
    
    public void display(){
        boolean done = false;
        do {            
            System.out.println("*****************************************************\n"
                         + "***   Welcome : Great City Of Aarom MAIN MENU     ***\n"
                         + "*****************************************************\n"
                         + " N - Start New Game\n L - Load a Saved Game\n"
                         + " H - Get Help \n S - Save Game\n Q - Quit or Exit\n");
            String input = getInput();
            done = doAction(input);
        } while (!done);
    }
    
    public String getInput(){
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        return choice;
    }
    public boolean doAction(String input){
        input = input.toUpperCase();
        switch (input){
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
            default: System.out.println("Invalid option, please try again...");
        }
        return false;
    }

    private void helpGame() {
        System.out.println("You have called option H for Help...");
        HelpMenu help = new HelpMenu();
        help.display();
    }
    
    private void startNewGame() {
        System.out.println("You have called option N for New Game...");
    }
    
    private void loadGame() {
        System.out.println("You have called option L for Load Game...");
    }
    
    private void saveGame() {
        System.out.println("You have called option S to Save Game...");
    }
}
