/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;

import java.util.Arrays;
import newpackage.Animal;
import newpackage.Author;
import newpackage.Location;
import newpackage.Map;
import newpackage.Player;
import newpackage.Point;
import newpackage.Provision;
import newpackage.Question;

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
        Point PointOne = new Point();
        PointOne.setColumns(1);
        PointOne.setRows(1);
        int PointOneColumn = PointOne.getColumns();
        int PointOneRow = PointOne.getRows();
        System.out.println("Column = " + PointOneColumn +
                           "\nRow = " +  PointOneRow );
        
        
        //Class Location 
         Location LocationOne = new Location();
         LocationOne.setNameId(1);
         LocationOne.setAddress("South 14587");
         LocationOne.setDescription("The scene woods");
         int LocationName = LocationOne.getNameId();
         String LocationAddress = LocationOne.getAddress();
         String LocationDescription = LocationOne.getDescription();
         System.out.println("Name ID =" + LocationName +
                            "\nAddress =" + LocationAddress +
                            "\nDescription = " + LocationDescription);
         
         // Class Map
         Map YouMap = new Map();
        int[][] location = null;         
         YouMap.setLocation(location);
         int[][] points = null;
         YouMap.setPoints(points);
         int[][] MapLocationone = YouMap.getLocation();
         int[][] MapPoints = YouMap.getPoints();
         System.out.println("Location = " + Arrays.toString(MapLocationone) +
                            "\nPoints = " + Arrays.toString(MapPoints));
         
         
         // Class Question 
         Question WhichQuestion = new Question();
         WhichQuestion.setQuestion("How many waters bottles do you want now?");
         WhichQuestion.setAnswer("I want to 25 waters bottles right now!!!!");
         String QuestionAgains = WhichQuestion.getQuestion();
         String AnswerAgains = WhichQuestion.getAnswer();
         System.out.println("Question = " + QuestionAgains +
                            "\nAnswers = " + AnswerAgains);
         
         // Class Provision
         Provision Living = new Provision();
         Living.setName("Rats");
         Living.setPerishable(Boolean.TRUE);
         String ProviName = Living.getName();
         Boolean Prerish = Living.getPerishable();
         System.out.println("Name = " + ProviName +
                            "\nIt's Perishable = " + Prerish);
         
         // Class Animal 
         Animal BestAnimal = new Animal();
         BestAnimal.setName("Elephant");
         BestAnimal.setAge(85);
         String MyNameis = BestAnimal.getName();
         int Myageis = BestAnimal.getAge();
         System.out.println(BestAnimal.toString());
         
         // Class Author
         Author MyAuthor = new Author();
         MyAuthor.setName("Rafael Monzon");
         String BestAuthor = MyAuthor.getName();
         System.out.println("Author = " + BestAuthor);
    
    }
    
    
    
    
}
