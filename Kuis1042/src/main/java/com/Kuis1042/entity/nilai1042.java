/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1042.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "nilai_1042")
public class nilai1042 implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 255, nullable = false)
    private String nama;
    
    @Column(length = 255, nullable = false)
    private String nilai_Softskill;
    
    @Column(length = 255, nullable = true)
    private String nilai_Hardskill;
    
    @Column(length = 255, nullable = false)
    private String nilai_TeamWork;
    
    @ManyToOne
    private cv1042 cv1042;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNilai_Softskill() {
        return nilai_Softskill;
    }


    public void setNilai_Softskill(String nilai_Softskill) {
        this.nilai_Softskill = nilai_Softskill;
    }
    
    public String getNilai_Hardskill() {
        return nilai_Hardskill;
    }


    public void setNilai_Hardskill(String nilai_Hardskill) {
        this.nilai_Hardskill = nilai_Hardskill;
    }
    
    public String getNilai_TeamWork() {
        return nilai_TeamWork;
    }


    public void setNilai_TeamWork(String nilai_TeamWork) {
        this.nilai_TeamWork = nilai_TeamWork;
    }

    public cv1042 getCategory() {
        return cv1042;
    }

    public void setcv1042(cv1042 cv1042) {
        this.cv1042 = cv1042;
    }
    
    
}
