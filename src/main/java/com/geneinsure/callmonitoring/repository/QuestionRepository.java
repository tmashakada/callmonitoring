/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geneinsure.callmonitoring.repository;

import com.geneinsure.callmonitoring.entity.Question;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author "Tafadzwa"
 */
public interface QuestionRepository extends JpaRepository<Question, Long>{
  
     public List<Question> findAllByOrderByQuestionNumberAsc();       
}
