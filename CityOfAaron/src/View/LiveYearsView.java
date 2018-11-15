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
public abstract class LiveYearsView extends SuperView{

    public LiveYearsView() {
    }

    public void display() {
        boolean done = false;
        do {
            System.out.println("\nPlease select option Consult menu needed:\n"
                    + "V - View Annual Report\n"
                    + "H - The number of bushels of wheat that are harvested\n"
                    + "O - The number of bushels of wheat paid in offering\n"
                    + "W - The total number of bushels of wheat in store\n"
                    + "R - The number of bushels of wheat in store eaten by rats\n"
                    + "P - The number of people that starve"
                    + "C - The number of people that move into the city"
                    + "S - Save Game\n"
                    + "Q - Return to the Last Menu\n");
            String input = getInput();
            done = doAction(input);
        } while (!done);
    }

    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String choice = keyboard.nextLine();
        return choice;
    }

    public boolean doAction(String input) {
        input = input.toUpperCase();
        switch (input) {
            case "Q":
                System.out.println("Returning to previous Menu..");
                return true;
            case "V":
                ViewAnnualReport();
                break;
            case "H":
                AnnualwheatHarvested();
                break;
            case "O":
                AnnualwheatPaidoffering();
                break;
            case "W":
                AnnualWheatStore();
                break;
            case "R":
                AnnualwheatStoreEatenRats();
                break;
            case "P":
                NumberPeopleStarve();
                break;
            case "C":
                NumberPeopleMoveCity();
                break;
            case "S":
                SaveGame();
                break;
            default:
                System.out.println("Invalid option, please try again...");
        }
        return false;
    }

    private void ViewAnnualReport() {
        System.out.println("Verify the annual report for any stadisty for all the resourse in a year, \n"
                + "Please, use \"V\" option.");
    }

    private void AnnualwheatHarvested() {
        System.out.println("How many might made a year?."
                + " Verify the production into a year using \"H\" option. ");
    }

    private void AnnualwheatPaidoffering() {
        System.out.println("How many could i paid the offering in a year?, \n"
                + "Please, verify the total, amount using this \"O\" option");
    }

    private void AnnualWheatStore() {
        System.out.println("How many wheats can you keep in a year? so please use \"W\" option ");
    }

    private void AnnualwheatStoreEatenRats() {
        System.out.println("Do you know how much you lost during the year by eaten by rats?"
                + " Please use this \"R\" option. ");
    }

    private void NumberPeopleStarve() {
        System.out.println("Do you know how many people you let starving during the year?"
                + " Please use this \"P\" option");
    }

    private void NumberPeopleMoveCity() {
        System.out.println("Do you know how many people moved to another city in a year?"
                + " Please use \"C\" option.");
    }

    private void SaveGame() {
        System.out.println("Use this \"S\" option for keeping your game into somewhere :) ");
    }

}
