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
public class Calls implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    
    private String supervisor;
   
    @Column(nullable = false,name = "created_ts")
    private LocalDateTime createdTimeStamp;
    
    @Column(name="call_ref")
    private String callRef;
    
    @Column(name="call_recording_ref")
    private String callRecordingRef;
    @Column(name="customer_number")
    private String customerNumber;
    
    @OneToMany(mappedBy = "call")
    private List<Result> results;
    
}
