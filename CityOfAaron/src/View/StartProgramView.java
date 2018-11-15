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
public abstract class StartProgramView extends SuperView{

    public StartProgramView() {
    }
    
    
    public void display(){
        System.out.println  ("***********************************************************\n"
                            +"**** Welcome to the City of Aaron Game. Awesome Game! *****\n"
                            +"***********************************************************\n");
        getInput();
        MainMenu main = new MainMenu();
        main.display();
    }
    
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
    
}
