/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author Rafael.M
 */
public abstract class View implements ViewInterface {
    // Declare my variables 
    protected String displayMessage;

    public View() {
    }

    public View(String message) {
        displayMessage = message;
    }
        
    @Override
    public void display() {
        boolean superView = false;
        do {
            String input = getInputs();
            if (input == null || input.length() < 1 || input.equalsIgnoreCase("Q")) {
                return;
            } else {
                superView = doAction(input);
            }
        } while (superView != true);
    }

    @Override
    public String getInput(String promptMessage) {
        String input = "";
        boolean valid = false;
        while (valid == false) {
            Scanner inFile;
            inFile = new Scanner(System.in);
            System.out.println(promptMessage);

            input = inFile.nextLine();
            String selection = input.trim();
            if (selection.length() < 1){
                System.out.println("\n You need specify a value\n");
            }                
            else{
                input = selection;
                valid = true;
            }            
        }
        return input;
    }
    
    @Override   
    public String getInputs(){
        return getInput(displayMessage);
        
    }
}
