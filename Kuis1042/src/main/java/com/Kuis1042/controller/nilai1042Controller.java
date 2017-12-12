/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1042.controller;

import com.Kuis1042.entity.nilai1042;
import com.Kuis1042.service.nilai1042Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.Kuis1042.repo.nilai1042Repo;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/nilai1042")
public class nilai1042Controller {
    
    @Autowired
    private nilai1042Service nilai1042Service;
    
    @RequestMapping(method = RequestMethod.POST)
    public nilai1042 insertOrUpdate(@RequestBody nilai1042 nilai1042){
        return nilai1042Service.insertOrUpdate(nilai1042);
    }
  
}
