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
public abstract class NewLocationView extends View{

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
            //String input = getInput();
            //done = doAction(input);
        } while (!done);
    }
    

    
}
        
//    private void actualLocation() {
//        System.out.println("You have selected Actual Location...");
//    }
//    
//    private void possibleMove() {
//        System.out.println("You have selected Possible Move...");
//    }
//    
//    private void coordinates() {
//        System.out.println("You have selected Move into specifics coordinates...");
//    }
//    
//        
//    private void seeLastLocation() {
//        System.out.println("You have selected to see Last location...");
//    }
    
//
