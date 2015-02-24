package com.softserveinc.ita.jexercises.business.utils;

/**
 * Represents exception object that is thrown if user input incorrect or
 * unsafe code
 * @author Volodymyr yakymiv
 * @version 1.0
 */
public class UnsuccessEvent extends Exception {

    public UnsuccessEvent (String message){
        super (message);
    }
}
