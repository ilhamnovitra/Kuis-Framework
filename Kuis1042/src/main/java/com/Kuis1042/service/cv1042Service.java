/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1042.service;

import com.Kuis1042.entity.cv1042;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Kuis1042.repo.cv1042Repo;

/**
 *
 * @author Hendro Steven
 */
@Service("cv1042Service")
@Transactional
public class cv1042Service {

    @Autowired
    private cv1042Repo repo;

    public cv1042 insert(cv1042 cv1042) {
        return repo.save(cv1042);
    }
    
    public cv1042 update(cv1042 cv1042) {
        return repo.save(cv1042);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public cv1042 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<cv1042> getAll(){
        return repo.findAllcv1042();
    }
}
