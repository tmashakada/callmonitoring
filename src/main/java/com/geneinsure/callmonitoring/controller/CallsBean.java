/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geneinsure.callmonitoring.controller;
import com.geneinsure.callmonitoring.entity.Question;
import com.geneinsure.callmonitoring.model.QuestionType;
import com.geneinsure.callmonitoring.service.QuestionServiceImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author "Tafadzwa"
 */
@Named
@SessionScoped
public class CallsBean implements Serializable{
    
      private String name;
      private String supervisor;
      private String callreference;
      private List<QuestionType>  questionTypeList = new ArrayList<>();;
      private List<Question> questions=new ArrayList<>();
      private Map<Question, String> selectedOptions = new HashMap<>();
      HashMap< String, QuestionType> hash_map = new HashMap< >();
      @Autowired
      QuestionServiceImpl questionServiceImpl;
      
     @PostConstruct
     public void init() {
         questions= questionServiceImpl.getAllQuestions();
          for(Question question: questions){
             QuestionType questionType=new  QuestionType();
             questionType.setQuestiongrpType(question.getQuestionType());
             hash_map.put(question.getQuestionType(),  questionType) ;
          }
         
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public Map<Question, String> getSelectedOptions() {
        return selectedOptions;
    }

    public void setSelectedOptions(Map<Question, String> selectedOptions) {
        this.selectedOptions = selectedOptions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getCallreference() {
        return callreference;
    }

    public void setCallreference(String callreference) {
        this.callreference = callreference;
    }

    public List<QuestionType> getQuestionTypeList() {
          List<QuestionType> listValues= new ArrayList<>( hash_map .values());
          System.out.println(" "+listValues.size());
           questionTypeList=listValues;
        
        return questionTypeList;
    }

    public void setQuestionTypeList(List<QuestionType> questionTypeList) {
        this.questionTypeList = questionTypeList;
    }

  
    
    
     public void save(){
        System.out.println("Name"+name);
        System.out.println("Supervisor "+supervisor);
        System.out.println("Call Reference "+callreference);
        //System.out.println("BBBbb "+selectedOptions);
      //  System.out.println("BBBbb "+selectedOption2);
      //  List<Field> listValues= new ArrayList<>( selectedOptions .values());
     //   System.out.println(" "+listValues.size());
        //selectedOptions.forEach((k, v) -> System.out.println((k.getQuestionNumber()+" "+k.getDescription() + ":" + v)));
        for (Map.Entry<Question, String> entry : selectedOptions.entrySet()) {
            
             
             System.out.println(entry.getKey().getQuestionNumber()+" "+entry.getKey().getDescription()+" "+entry.getValue());
    
          }
    } 
}
