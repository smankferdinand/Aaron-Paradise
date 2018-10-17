/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;

import newpackage.Scene;

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
        Scene Sceneone = new Scene();
        
        
        Sceneone.setName("Rafael Monzon");
        Sceneone.setDescription("First scene ");
       
       
        
        String SceneoneName = Sceneone.getName();
        String SceneoneDescription = Sceneone.getDescription();
        
        System.out.println(Sceneone.toString());
      
    }
    
}
