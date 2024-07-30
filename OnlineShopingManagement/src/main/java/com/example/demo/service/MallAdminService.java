package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MallAdmin;
import com.example.demo.repository.MallAdminRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class MallAdminService {
    @Autowired
    private MallAdminRepository mallAdminRepository;
    
    public List<MallAdmin> getAllMallAdmins() {
        return mallAdminRepository.findAll();
    }
    
    public MallAdmin getMallAdminById(int id) {
        return mallAdminRepository.findById(id).orElse(null);
    }
    
    public MallAdmin saveMallAdmin(MallAdmin mallAdmin) {
        return mallAdminRepository.save(mallAdmin);
    }
    
    public void deleteMallAdmin(int id) {
        mallAdminRepository.deleteById(id);
    }
}