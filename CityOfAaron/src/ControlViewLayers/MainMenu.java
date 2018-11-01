/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlViewLayers;

import java.util.Scanner;

/**
 *
 * @author Rafael.M
 */
public class MainMenu extends MenuView {

    Scanner keyboard = new Scanner(System.in);

    public MainMenu() {

        Menu("\n"
                + "*****************************************************\n"
                + "*  Welcome : Great City Of Aarom MAIN MENU   *\n"
                + "*****************************************************\n"
                + " 1 - Start New Game\n"
                + " 2 - Get and Start a Saved Game\n"
                + " 3 - Get Help \n"
                + " 4 - Save Game\n"
                + " 5 - Quit\n",
                5);
    }

    private void Menu(String string, int i) {

    }

    public void doAction(int option) {
      
        switch (option) {
            
            case 1:
                startNewGame();
                break;
         
            case 2:
                startSavedGame();
                break;
          
            case 3:
                HelpMenu();
                break;
           
            case 4:
                SaveGame();
                break;
           
            case 5:
                System.out.println("Thanks for playing! Goodbye =D\n");
        }
    }

    public void startNewGame() {

        System.out.println(
                "***********************************************************\n"
                + "* Welcome to the City of Aaron. Awesome Game!  *\n"
                + "***********************************************************/n");

        String name;
        System.out.println("Please enter your first name: ");
        name = keyboard.next();

        System.out.println("Welcome " + name + ". Have fun playing.");

        GameMenu.createNewGame(name);

    }

    public void startSavedGame() {
        System.out.println("Start Saved Game option Selected");

        Scanner input = new Scanner(System.in);

        input.nextLine();

        System.out.println("File path of the game wanted: ");
        String fileName;
        fileName = input.nextLine();

    }

    private void HelpMenu() {
      
    }

    private void SaveGame() {
      
    }

}
