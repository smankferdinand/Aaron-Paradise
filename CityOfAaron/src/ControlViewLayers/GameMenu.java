/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlViewLayers;

import newpackage.Player;
import newpackage.Game;
import newpackage.Map;
import java.util.Scanner;
/**
 *
 * @author Rafael.M
 */
public class GameMenu {
    
    public static void main(String[] args) {        
        Game runningGame = new Game();    //not too sure to initialize it on this way
        int opt = 1;
        do {                        
            MainMenuView();
            opt = getInputs(1,5);
            doActionMainMenuView(opt,runningGame);
        } while (opt != 5);
    }
    
    
    public static void GameMenuView(Game runningGame) {
        System.out.println(runningGame.getName()+", please select one option:"
                            +"1 - View the map\n 2 - Move to a new location\n"
                            +" 3 - Manage the Crops\n 4 - Live the Year\n"
                            +" 5 - Reports Menu\n 6 - Save Game\n"
                            +" 7 - Return to the Main Menu\n");
    }

    public static void MainMenuView() {
        System.out.println("*****************************************************\n"
                         + "***   Welcome : Great City Of Aarom MAIN MENU     ***\n"
                         + "*****************************************************\n"
                         + " 1 - Start New Game\n 2 - Load a Saved Game\n"
                         + " 3 - Get Help \n 4 - Save Game\n 5 - Quit\n");
    }
    
    public static void doActionGameMenu(int option,Game runningGame) {
        switch (option) {            
            case 1: //View the map
                break;
            case 2: //Move to a new locatio
                break;
            case 3: //Manage the Crops
                break;
            case 4: //Live the Year
                break;
            case 5: //Reports Menu
                break;
            case 6: //Save Game
                break;
            case 7: //Return to the Main Menu
                break;
        }
    }
    public static void doActionMainMenuView(int option,Game runningGame) {
        switch (option) {            
            case 1:
                String playerName = startNewGame();
                Player newPlayer = new Player();
                newPlayer.setName(playerName);
                runningGame.setPlayer(newPlayer);
                GameMenuView(runningGame);                
                int opt = getInputs(1,7);
                doActionGameMenu(opt, runningGame);
                break;         
            case 2:
                runningGame = loadSavedGame();
                //Game savedGame = getInputs(4,6);    
                GameMenuView(runningGame);                                        
                opt = getInputs(1,7);
                doActionGameMenu(opt, runningGame);
                break;
          
            case 3:
                HelpMenu();
                break;
           
            case 4:
                SaveGame(runningGame);
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
        System.out.print("Please enter your first name: ");
        String name = keyboard.next();
        System.out.println("***********************************************************\n");
        System.out.println("Welcome " + name + ". Have fun playing!\n");
        System.out.println("***********************************************************\n");
        return name;
    }

    public static Game loadSavedGame() {        
        Game savedGame = new Game();
        System.out.println("Start Saved Game option Selected");
        Scanner input = new Scanner(System.in);
        input.nextLine();
        System.out.println("File path of the game wanted: ");
        String fileName;
        fileName = input.nextLine();
        //At this option, we will read from somewhere a saved game and will pass it
        //to get a game from that location and loaded here: savedGame
        return savedGame;
    }

    private static void HelpMenu() {
        //under construction!
    }

    private static void SaveGame(Game actualGame) {
        //idem but reverse of option 2.
        //At this option, we will SAVE somewhere the game
    }
    
    private static int getInputs(int min, int max){
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
                for (int i = min; i < max+1; i++)
                    System.out.print(i + ", ");        
                System.out.print(" please try again...\n");
            }
        } while (entered < min || entered > max);
        return entered; 
    }
}
