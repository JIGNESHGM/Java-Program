package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Mall;
import com.example.demo.service.MallService;

@RestController
@RequestMapping("/api/malls")
public class MallController {
    @Autowired
    private MallService mallService;
    
    @GetMapping
    public List<Mall> getAllMalls() {
        return mallService.getAllMalls();
    }
    
    @GetMapping("/{id}")
    public Mall getMallById(@PathVariable int id) {
        return mallService.getMallById(id);
    }
    
    @PostMapping
    public Mall saveMall(@RequestBody Mall mall) {
        return mallService.saveMall(mall);
    }
    
    @DeleteMapping("/{id}")
    public void deleteMall(@PathVariable int id) {
        mallService.deleteMall(id);
    }
}