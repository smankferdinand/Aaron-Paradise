/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

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
        if (input.length() > 1){
            System.out.println  ("***********************************************************\n");
            System.out.print  ("********* Welcome " + input + ". Have fun playing! *********");                    
            for (int i=input.length()+1 ; i < 13; i++){
                System.out.print("*");
            }
            System.out.println();
            System.out.println("***********************************************************\n");
            MainMenuView main = new MainMenuView() {};
            main.display();
            return true;
        }
        else{
            System.out.println  ("ERROR. Name entered: " + input + ", is invalid, please correct...\n");
            return false;
        }
    }
        
}
