/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geneinsure.callmonitoring.controller;

import java.io.Serializable;
import javax.annotation.PostConstruct;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author "Tafadzwa"
 */


@Named
@ViewScoped
public class CallsController  implements Serializable {
    
    private   String selectedOption;
    @PostConstruct
    public void init() {
        
    }

    public String getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
    }
    
    
   public void save(){
      System.out.println("selected  Option"+selectedOption) ;
   }
}
