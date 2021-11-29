/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geneinsure.callmonitoring.service;

import com.geneinsure.callmonitoring.entity.Question;
import com.geneinsure.callmonitoring.repository.QuestionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author "Tafadzwa"
 */
@Service
public class QuestionServiceImpl implements QuestionService{

     @Autowired
     QuestionRepository questionRepository;
    @Override
    public List<Question> getAllQuestions() {
        return    questionRepository.findAllByOrderByQuestionNumberAsc();
       
    }
    
}
