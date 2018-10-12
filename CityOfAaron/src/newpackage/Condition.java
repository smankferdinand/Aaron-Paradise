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
 Ferdinand(),
 Rafael(),
 David();

    public void setGood(double good) {
        this.good = good;
        }
    public void setFair(double fair) {
        this.fair = fair;  
    }
    public void setPoor(double poor) {
          this.poor = poor;
    }
    
    private double good;
    private double fair;
    private double poor;
    Condition(double good, String tool, double fair, double poor){
        this.good = good;
        this.fair = fair;
        this.poor = poor;
    }
    }

