/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;

import newpackage.Player;
import newpackage.Point;

/**
 * Rafael Monzón
 * @author dcars
 * @ Smank Ferdinand
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //individul Assigment by Rafael Monzón
        Player Playerone = new Player();
       
        Playerone.setName("Rafael Monzon");
        
        String SceneoneName = Playerone.getName();
        
        System.out.println("Name = " + SceneoneName);
      
         // Class Point 
    // Class Point 
        Point PointOne = new Point();
        PointOne.setColumns(1);
        PointOne.setRows(1);
        int PointOneColumn = PointOne.getColumns();
        int PointOneRow = PointOne.getRows();
        System.out.println("Column = " + PointOneColumn +
                           "\nRow = " +  PointOneRow );
    }
    
}
