/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
/**
 *
 * @author Smank Ferdinand
 */
public enum Condition {
  Name("Shovel","Hammer","Screw"),
  Condition("Poor","Fair","Good");
    
// classes variable    
    private final String good;
    private final String fair;
    private final String poor;
    
    Condition(String good, String fair, String poor){
        this.good = good;
        this.fair = fair;
        this.poor = poor;
    }

    public String getGood() {
        return good;
    }

    public String getFair() {
        return fair;
    }

    public String getPoor() {
        return poor;
    }

    @Override
    public String toString() {
        return "Condition{" + "good=" + good + ", fair=" + fair + ", poor=" + poor + '}';
    }
    
    
    }

