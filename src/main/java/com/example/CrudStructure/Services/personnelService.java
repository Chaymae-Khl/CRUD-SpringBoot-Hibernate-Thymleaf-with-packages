/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.CrudStructure.Services;

import com.example.CrudStructure.Models.personnel;
import com.example.CrudStructure.Repository.personnelRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class personnelService {
    @Autowired
    
    private personnelRepository repo;
    
    public List<personnel> listAll(){
    return repo.findAll();
    }
     public void save(personnel per){
    repo.save(per);
    
    }
    
    public personnel get(Long id){
    return repo.findById(id).get();
    }
    
    public void delete(Long id){
    repo.deleteById(id);
    }
   
}
