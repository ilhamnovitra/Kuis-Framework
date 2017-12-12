/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1042.repo;

import com.Kuis1042.entity.cv1042;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface cv1042Repo extends CrudRepository<cv1042, Long> {

    @Query("select c from Category c")
    public List<cv1042> findAllcv1042();
}
