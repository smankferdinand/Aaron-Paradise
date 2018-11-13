/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author Smank Ferdinand
 */
public class WareHouseView {
    public WareHouseView() {
    }
    
        public void display(){
        boolean done = false;
        do {            
            System.out.println  ("W - Ware House\n" 
                                +"G - Game Menu\n"
                                +"R - Return to previous Menu\n");
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
        input = input.toLowerCase();
        switch (input){
            case "R":
                System.out.println("Returning to previous Menu...");
                return true;
            case "W":
                WareHouse();
                break;
            case "G":
                GameMenu();
                break;
            default: System.out.println("Invalid option, please try again...");
        }
        return false;
    }   
  
   private void WareHouse() {
        System.out.println("Please, use this \"W\" option to know the number of Items stored in the Ware House,\n"
                + " and make preparetion for future references");
   }
   private void GameMenu() {
       System.out.println("Please, use this \"G\" option to return to the game menu");
    }
}

