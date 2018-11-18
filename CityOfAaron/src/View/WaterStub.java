/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Smank Ferdinand
 */
public abstract class WaterStub extends View{
    
    public WaterStub(){    
        super("Please, Kindly enter a value between 1 and 100: \n");

    }
    
    @Override
    public boolean doAction(String enteredValue){
        int value = Integer.valueOf(enteredValue);
        if (value < 1 || value > 100){
            System.out.println("ERROR,Invalid value! \n"
                    + "Please, enter a positive value and it cannot be greater than 100\n");            
            return false;
        }
        else{
            return true;
        }
    }
    
    
}