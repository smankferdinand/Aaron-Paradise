/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author David Carsin
 */
public abstract class NewLocationView extends SuperView{

    public NewLocationView() {
    }
    
        public void display(){
        boolean done = false;
        do {            
            System.out.println  ("A - Actual Location\n "
                                +"P - Possible Move\n"
                                +"C - Move into specifics coordinates\n "
                                +"L - See last location\n "
                                +"E - Return to previous Menu\n");
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
            case "E":
                System.out.println("Returning to previous Menu...");
                return true;
            case "A":
                actualLocation();
                break;
            case "P":
                possibleMove();
                break;
            case "C":
               coordinates();
                break;
            case "L":
               seeLastLocation();
                break;
            default: System.out.println("Invalid option, please try again...");
        }
        return false;
    }
        
    private void actualLocation() {
        System.out.println("You have selected Actual Location...");
    }
    
    private void possibleMove() {
        System.out.println("You have selected Possible Move...");
    }
    
    private void coordinates() {
        System.out.println("You have selected Move into specifics coordinates...");
    }
    
        
    private void seeLastLocation() {
        System.out.println("You have selected to see Last location...");
    }
    
}
