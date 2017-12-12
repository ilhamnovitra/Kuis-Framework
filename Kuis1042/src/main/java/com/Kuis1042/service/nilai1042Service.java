/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1042.service;

import com.Kuis1042.entity.nilai1042;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Kuis1042.repo.nilai1042Repo;

/**
 *
 * @author Hendro Steven
 */
@Service("nilai1042Service")
@Transactional
public class nilai1042Service {

    @Autowired
    private nilai1042Repo repo;

    public nilai1042 insertOrUpdate(nilai1042 nilai1042) {
        return repo.save(nilai1042);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public List<nilai1042> findAll() {
        return repo.findAllNilai_1042();
    }

    public List<nilai1042> findByCv_1042(Long nilai1042Id) {
        return repo.findByCv_1042(nilai1042Id);
    }

    public List<nilai1042> findByNama(String nama) {
        return repo.findByNama("%" + nama + "%");
    }
}
