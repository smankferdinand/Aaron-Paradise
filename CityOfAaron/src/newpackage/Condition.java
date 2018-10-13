/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Smank Ferdinand
 */
public enum Condition {
  NAME(),
  STATE();
    
// classes variable    
    private final double good;
    private final double fair;
    private final double poor;
    
    Condition(double good, double fair, double poor){
        this.good = good;
        this.fair = fair;
        this.poor = poor;
    }

    public double getGood() {
        return good;
    }

    public double getFair() {
        return fair;
    }

    public double getPoor() {
        return poor;
    }

    @Override
    public String toString() {
        return "Condition{" + "good=" + good + ", fair=" + fair + ", poor=" + poor + '}';
    }
    
    
    }

