/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author David Carsin
 */
public abstract class ReportMenuView extends View{

    public ReportMenuView() {
    }
    
    public void display(){
        boolean done = false;
        do {            
            System.out.println  ("Y - The year number\n"
                                +"S - How many people starved\n"
                                +"C - How many people came to the city\n" 
                                +"P - The current population\n"
                                +"A - The number of acres of crop land owned by the city\n"
                                +"B - The number of bushels per acre in this years harvest\n"
                                +"W - The total number of bushels of wheat harvested\n" 
                                +"T - The number of bushels paid in tithes and offerings\n" 
                                +"R - The number of bushels of wheat eaten by rats\n" 
                                +"U - The number of bushels of wheat in store\n"
                                +"E - Return to previous Menu\n");
            String input = getInput();
            done = doAction(input);
        } while (!done);
    }
    
    public String getInput(){
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        return choice;
    }
    
    public boolean doAction(String input){
        input = input.toUpperCase();
        switch (input){
            case "E":
                System.out.println("Returning to previous Menu...");
                return true;
            case "Y":
                currentYear();
                break;
            case "S":
                starved();
                break;
            case "C":
                comeToCity();
                break;
            case "P":
               population();
                break;
            case "A":   
               acresOwned();
                break;
            case "B":   
               acresOwned();
                break;
            case "W":   
               wheatHarvested();
                break;
            case "T":   
               tithesOfferings();
                break;
            case "R":   
               eatenByRats();
                break;
            case "U":   
               bushelsWheat();
                break;
            default: System.out.println("Invalid option, please try again...");
        }
        return false;
    }
        
    private void currentYear() {
        System.out.println("The year number:");
    }
    
    private void starved() {
        System.out.println("How many people starved:");
    }
    
    private void comeToCity() {
        System.out.println("How many people came to the city:");
    }
    
    private void population() {
        System.out.println("The current population:");
    }
    
    private void acresOwned() {
        System.out.println("The number of acres of crop land owned by the city:");
    }
        
    private void acreThisYear() {
        System.out.println("The number of bushels per acre in this years harvest:");
    }
    
    private void wheatHarvested() {
        System.out.println("The total number of bushels of wheat harvested:");
    }
        
    private void tithesOfferings() {
        System.out.println("The number of bushels paid in tithes and offerings:");
    }
        
    private void eatenByRats() {
        System.out.println("The number of bushels of wheat eaten by rats:");
    }
        
    private void bushelsWheat() {
        System.out.println("The number of bushels of wheat in store:");
    }
    
}
