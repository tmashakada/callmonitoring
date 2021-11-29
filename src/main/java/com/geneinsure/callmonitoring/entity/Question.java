/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geneinsure.callmonitoring.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;

/**
 *
 * @author "Tafadzwa"
 */
@Entity
@Data
public class Question implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "question_type")
    private String questionType;
    
    private String description;
    private String responseType;
    @Column(nullable = false,name = "created_ts")
    private LocalDateTime createdTimeStamp;
    
    @Column(name = "updated_ts")
    private LocalDateTime updatedTimeStamp;
    @Column(name = "question_number")
    private int questionNumber;
    
    @OneToMany(mappedBy = "question")
    private List<Result> results;
    
}
