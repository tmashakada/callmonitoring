/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geneinsure.callmonitoring.exception;

/**
 *
 * @author "Tafadzwa"
 */
public class QuestionException extends Exception{
    public QuestionException() {
    }

    public QuestionException(String message) {
        super(message);
    }

   
    public QuestionException(Throwable message) {
        super(message);
    }
}
