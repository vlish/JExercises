package com.softserveinc.ita.jexercises.business.utils;

/**
 * Represents exception object that is thrown if user input incorrect or
 * unsafe code.
 * @author Volodymyr yakymiv
 * @version 1.0
 */
public class InterpreterEvalException extends Exception {

    /**
     * Method witch return bad event.
     * @param message of event.
     */
    public InterpreterEvalException(String message){
        super (message);
    }
}
