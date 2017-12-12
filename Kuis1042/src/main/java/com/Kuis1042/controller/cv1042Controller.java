/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1042.controller;

import com.Kuis1042.entity.cv1042;
import com.Kuis1042.service.cv1042Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/cv1042")
public class cv1042Controller {

    @Autowired
    private cv1042Service cv1042Service;

    @RequestMapping(method = RequestMethod.POST)
    public cv1042 insert(@RequestBody cv1042 cv1042) {
        return cv1042Service.insert(cv1042);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public cv1042 update(@RequestBody cv1042 cv1042) {
        return cv1042Service.update(cv1042);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return cv1042Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public cv1042 getById(@PathVariable("id") Long id){
        return cv1042Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<cv1042> getAll(){
        return cv1042Service.getAll();
    }
}
