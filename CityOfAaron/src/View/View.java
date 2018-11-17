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
public abstract class View implements ViewInterface{
// Declare my variables 
    protected String displayMessage;
    private String getInput;  

    public View(){        
    }
    
    public View(String message) {        
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        System.out.println(displayMessage);
    }
    
    public void setDisplay(String message) {
        this.displayMessage = message;
    }

    public void setInput(String getInput) {
        this.getInput = getInput;
    }
    
}
