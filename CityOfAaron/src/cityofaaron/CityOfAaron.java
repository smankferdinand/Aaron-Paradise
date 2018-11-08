/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;

import Control.HarvestCrops;
import Control.FeedPeople;
import Control.ControlLayer;
import java.util.Arrays;
import Model.Animal;
import Model.Author;
import Model.Location;
import Model.Map;
import Model.Player;
import Model.Point;
import Model.Provision;
import Model.Question;
import Model.Game;
import View.StartProgramView;

/**
 * Rafael Monzón
 * @author David Carsin
 * @ Smank Ferdinand
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartProgramView startView = new StartProgramView();
        startView.display();
      
        
    }
//        int bushels = 10;
//        int wheatInStorage = 100;
//       //call the class 
//       int rest = FeedPeople.CalculateHarvest(bushels, wheatInStorage);
//       //System.out.println("Your bushels of grain left is: "+rest);
//        
//        
//        // TODO code application logic here
//        //TestClasses();
//        
//        Game game = new Game();
//        //game.setCurrentPopulation(100);
//        int population = game.getCurrentPopulation();
//        //population += populationGrouth(game.getCurrentPopulation());
//        //1game.setCurrentPopulation(population);
//        
//        
//    
//    //}
//

//    
//    private static int populationGrouth(int population){
//        int grouth = Random(1, 5);
//        int movedIntoCity = population * (grouth/100);
//        return grouth;
//    }
//       
    public static void TestClasses(){
                /// Calculate The  amount wheat eaten by rats 
        int rnd = Random(1,100);
        int wheat = 150;
        //ControlLayer test1 = new ControlLayer();
        int eaterRats = ControlLayer.wheatRatEaten(rnd, wheat);
        System.out.println("Wheat Rat Eaten =" + eaterRats);
        
        
        // Calculate The amount Harvest crop yield for bear the Tithes and offerings
        int sort = Random(1,100);
        int grouth = 56;
       //call the class 
       int harvestTime = HarvestCrops.CalculateHarvest(sort, grouth);
       System.out.println("Your Crop Yield is: "+harvestTime);
        
        
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
    private static int Random(int i, int i0) {
        return 5;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
//}
