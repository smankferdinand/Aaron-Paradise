/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author Smank Ferdinand
 */
public class ControlLayerException extends Exception{
 
    public ControlLayerException() {
    }

    public ControlLayerException(String string) {
        super(string);
    }

    public ControlLayerException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public ControlLayerException(Throwable thrwbl) {
        super(thrwbl);
    }

    public ControlLayerException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}

