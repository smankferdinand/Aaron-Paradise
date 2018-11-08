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
public class BuyLandView {
  public BuyLandView() {
    }
    
        public void display(){
        boolean done = false;
        do {            
            System.out.println  ("B - Buy Land\n" 
                                 +"S- Sell Land\n"
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
        switch (input){
            case "R":
      System.out.println("Returning to previous Menu...");
                return true;
            case "B":
                BuyLand();
                break;
            case "S":
                SellLand();
                break;   
            default: System.out.println("Invalid option, please try again...");
        }
        return false;
    }   
  
   private void BuyLand() {
        System.out.println("Please, use this \"B\" option to know the number of lands available to buy,\n"
                + " and verify the location");
   }

    private void SellLand() {
        System.out.println("Please, use this \"S\" option to know the number of lands available to S,\n"
                + " and verify the location");
    }
}