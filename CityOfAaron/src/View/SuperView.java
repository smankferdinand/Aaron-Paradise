/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Rafael.M
 */
public abstract class SuperView implements ViewInterface{
// Declare my variables 
    private Void display;
    private String getInput;  
    // Constructor 
        public SuperView() {
    }
// Declare my getter and setter 
    public Void getDisplay() {
        return display;
    }

    public void setDisplay(Void display) {
        this.display = display;
    }

    public String getGetInput() {
        return getInput;
    }

    public void setGetInput(String getInput) {
        this.getInput = getInput;
    }

   
    
   
    
    
    
    
    
}
