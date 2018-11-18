/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Rafael 
 */
public abstract class CropsStub extends View{
        public CropsStub(){    
        super("Please enter a positive value, not greater than 200: \n");

    }
    
    @Override
    public boolean doAction(String enteredValue){
        int value = Integer.valueOf(enteredValue);
        if (value < 1 || value > 200){
            System.out.println("ERROR, Invalid value! Must be positive and can't be greater than 200\n");            
            return false;
        }
        else{
            return true;
        }
    }
}
