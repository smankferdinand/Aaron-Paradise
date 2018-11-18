/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author David Carsin
 */
public abstract class ControlStub extends View{
    
    public ControlStub(){    
        super("Please Enter a value between 1 and 100: \n");

    }
    
    @Override
    public boolean doAction(String enteredValue){
        int value = Integer.valueOf(enteredValue);
        if (value < 1 || value > 100){
            System.out.println("ERROR, Invalid value!\n");            
            return false;
        }
        else{
            return true;
        }
    }
    
    
}
