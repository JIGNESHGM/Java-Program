package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Mall;
import com.example.demo.repository.MallRepository;

@Service
public class MallService {
    @Autowired
    private MallRepository mallRepository;
    
    public List<Mall> getAllMalls() {
        return mallRepository.findAll();
    }
    
    public Mall getMallById(int id) {
        return mallRepository.findById(id).orElse(null);
    }
    
    public Mall saveMall(Mall mall) {
        return mallRepository.save(mall);
    }
    
    public void deleteMall(int id) {
        mallRepository.deleteById(id);
    }
}