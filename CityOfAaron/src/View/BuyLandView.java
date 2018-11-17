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
public abstract class BuyLandView extends View{
  public BuyLandView() {
      view("B - Buy Land\n" 
                                    +"S - Sell Land\n" 
                                    +"G - Game Menu\n"
                                    +"R - Return to previous Menu\n");
    }
    /*
       @Override 
       public void display(){
            boolean done = false;
            do {            
                System.out.println  ("B - Buy Land\n" 
                                    +"S - Sell Land\n" 
                                    +"G - Game Menu\n"
                                    +"R - Return to previous Menu\n");
                String input = getInput();
                done = doAction(input);
            } 
            while (!done);
    }
    */
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
            case "B":
                BuyLand();
                break;
            case "S":
                SellLand();
                break; 
            case "G":
                GameMenu();
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

    private void GameMenu() {
       System.out.println("Please, use this \"G\" option to return to the game menu");
    }

    private void view(String string) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}