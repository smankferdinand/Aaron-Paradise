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
public abstract class View implements ViewInterface {
// Declare my variables 

    protected String displayMessage;
    private String getInput;

    public View() {
    }

    @Override
    public void display() {
        boolean superView = false;
        do {
            String[] input = getInputs();

            if (input[0] == null || input.length < 1 || input[0].equalsIgnoreCase("Q")) {
                return;
            } else {
                superView = doAction(input);
            }
        } while (superView != true);

    }

    @Override
    public String getInput(String promptMessage) {

        String[] inputs = new String[1];
        boolean valid = false;

        while (valid == false) {
            Scanner inFile;
            inFile = new Scanner(System.in);
            System.out.println(promptMessage);

            inputs[0] = inFile.nextLine();

            String selection = inputs[0].trim();

            if (selection.length() < 1) {
                System.out.println("\n You need specify a value\n");
                continue;
            }
            inputs[0] = selection;
            valid = true;
        }
        return inputs[0];
    }

}
