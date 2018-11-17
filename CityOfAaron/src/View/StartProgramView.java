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
public abstract class StartProgramView extends View{

    public StartProgramView() {
        super("***********************************************************\n"+
             "**** Welcome to the City of Aaron Game. Awesome Game! *****\n"+
             "***********************************************************\n"+
             "Please enter your first name: ");
    }

    
    @Override
    public boolean doAction(String input){
        input = input.trim();
        if (input.length() > 2){
            System.out.println  ("***********************************************************\n"+
                                "********* Welcome " + input + ". Have fun playing! *********\n"+
                                "***********************************************************\n");
            MainMenuView main = new MainMenuView() {};
            main.display();
            return true;
        }
        else{
            System.out.println  ("Name: " + input + " is invalid, please try again\n");
            return false;
        }
    }
        
}
