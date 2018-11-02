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
public class MainMenu {
    
    public static void main(String[] args) {
        int opt = 1;
        do {                        
            MainMenuView();
            opt = SelectOneOption(1,5);
            doActionMainMenuView(opt);
        } while (opt != 5);
    }
    
    
    public static void GameMenuView(String playerName) {
        System.out.println(" 1 - View the map\n 2 - Move to a new location\n"
                            +" 3 - Manage the Crops\n 4 - Live the Year\n"
                            +" 5 - Reports Menu\n 6 - Save Game\n"
                            +" 7 - Return to the Main Menu\n");
    }

    public static void MainMenuView() {
        System.out.println("*****************************************************\n"
                         + "***   Welcome : Great City Of Aarom MAIN MENU     ***\n"
                         + "*****************************************************\n"
                         + " 1 - Start New Game\n 2 - Get and Start a Saved Game\n"
                         + " 3 - Get Help \n 4 - Save Game\n 5 - Quit\n");
    }

    public static void doActionGameMenu(int option) {
        switch (option) {            
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
    }
    public static void doActionMainMenuView(int option) {
        switch (option) {
            
            case 1:
                String playerName = startNewGame();
                GameMenuView(playerName);                
                int opt = SelectOneOption(1,7);
                doActionGameMenu(opt);
                break;         
            case 2:
                System.out.println("You selected option 2\n");
                startSavedGame();
                break;
          
            case 3:
                System.out.println("You selected option 3\n");
                HelpMenu();
                break;
           
            case 4:
                System.out.println("You selected option 4\n");
                SaveGame();
                break;
           
            case 5:
                System.out.println("You selected option 5\n");
                System.out.println("Thanks for playing! Goodbye =D\n");
                break;                
        }
    }

    public static String startNewGame() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("***********************************************************\n"
                            + "* Welcome to the City of Aaron. Awesome Game!  *\n"
                            + "***********************************************************/n");
        System.out.println("Please enter your first name: ");
        String name = keyboard.next();
        System.out.println("Welcome " + name + ". Have fun playing!\n");
        return name;
    }

    public static void startSavedGame() {
        System.out.println("Start Saved Game option Selected");

        Scanner input = new Scanner(System.in);

        input.nextLine();

        System.out.println("File path of the game wanted: ");
        String fileName;
        fileName = input.nextLine();

    }

    private static void HelpMenu() {
      
    }

    private static void SaveGame() {
      
    }
    
    private static int SelectOneOption(int min, int max){
        String entry;       
        Scanner keyboard = new Scanner(System.in);
        int entered = 0;
        do {            
            System.out.print("Please select one option:");
            entry = keyboard.nextLine();  
            char opt = entry.charAt(0);
            entered = opt - '0';
            System.out.println("     Valor: "+entered);
            if (entered < min || entered > max){
                System.out.print("Sorry :( \n\'"+opt+"\', that's not an option.\n The available options are: ");
                for (int i = min; i == max; i++)
                    System.out.print(i + ", ");        
                System.out.print(" please try again...\n");
            }
        } while (entered >= min && entered <= max);
        return entered;
    }
}
