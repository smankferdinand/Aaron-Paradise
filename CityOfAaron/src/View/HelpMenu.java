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
    
    public void display(){
        boolean done = false;
        do {            
        System.out.println("\nPlease select option HELP needed:\n"
                            +"G - What is the goal of the game?\n"
                            +"M - How to move\n"
                            +"E - Estimate the number of resources\n"
                            +"H - Harvest resources\n"
                            +"D - Delivering resources to warehouse\n"
                            +"Q - Quit\n"); 
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
            default: System.out.println("Invalid option, please try again...");
        }
        return false;
    }

    private void goalGame() {
        System.out.println("You have called option G for goalGame...");
    }
    
    private void moveGame() {
        System.out.println("You have called option M for Move Game...");
    }
    
    private void estimateGame() {
        System.out.println("You have called option E for Estimate Game...");
    }
    
    private void harvestGame() {
        System.out.println("You have called option H for Harvest Game...");
    }
    
    private void DeliveringGame() {
        System.out.println("You have called option D for Delivering Game...");
    }
}
