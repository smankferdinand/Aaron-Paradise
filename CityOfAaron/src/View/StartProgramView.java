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

    public StartProgramView(String message) {
        View(message);
    }

    public void StartProgramView() {
        View("***********************************************************\n"+
             "**** Welcome to the City of Aaron Game. Awesome Game! *****\n"+
             "***********************************************************\n");
    }
    /*
    @Override
    public void display(){
        System.out.println  ("***********************************************************\n"
                            +"**** Welcome to the City of Aaron Game. Awesome Game! *****\n"
                            +"***********************************************************\n");
        getInput();
        //MainMenuView main = new MainMenuView();
        //main.display();
    }
    */
    public void getInput(){
        Scanner keyboard = new Scanner(System.in);
        String name = "";
        do{
            System.out.print("Please enter your first name: ");
            name = keyboard.nextLine();
            if (name.isEmpty())
                System.out.println("Please add valid name:");  
        } while (name.isEmpty());
        System.out.println  ("***********************************************************\n");
        System.out.println  ("********* Welcome " + name + ". Have fun playing! *********\n");
        System.out.println  ("***********************************************************\n");
        
    }

    private void View(String string) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean doAction(String input){
        input = input.toUpperCase();
        return !input.isEmpty();
    }    
//    
//    public String getInput(){
//        Scanner keyboard = new Scanner(System.in);
//        String choice = keyboard.nextLine();
//        return choice;
//    }
}
