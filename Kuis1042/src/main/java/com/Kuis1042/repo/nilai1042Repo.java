/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis1042.repo;

import com.Kuis1042.entity.nilai1042;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


/**
 *
 * @author Hendro Steven
 */
public interface nilai1042Repo extends CrudRepository<nilai1042, Long>{
    
    @Query("select p from nilai_1042 p")
    public List<nilai1042> findAllNilai_1042();
    
    @Query("select p from nilai_1042 p where p.cv_1042.id= :id")
    public List<nilai1042> findByCv_1042(@Param("id") Long id);
    
    @Query("select p from nilai_1042 p where LOWER(p.nama) LIKE LOWER(:nama)")
    public List<nilai1042> findByNama(@Param("nama") String nama);
}
