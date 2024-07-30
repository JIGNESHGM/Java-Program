package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.MallAdmin;
import com.example.demo.service.MallAdminService;

@RestController
@RequestMapping("/api/mall-admins")
public class MallAdminController {
    @Autowired
    private MallAdminService mallAdminService;
    
    @GetMapping
    public List<MallAdmin> getAllMallAdmins() {
        return mallAdminService.getAllMallAdmins();
    }
    
    @GetMapping("/{id}")
    public MallAdmin getMallAdminById(@PathVariable int id) {
        return mallAdminService.getMallAdminById(id);
    }
    
    @PostMapping
    public MallAdmin saveMallAdmin(@RequestBody MallAdmin mallAdmin) {
        return mallAdminService.saveMallAdmin(mallAdmin);
    }
    
    @DeleteMapping("/{id}")
    public void deleteMallAdmin(@PathVariable int id) {
        mallAdminService.deleteMallAdmin(id);
    }
}