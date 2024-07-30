package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.MallAdmin;

public interface MallAdminRepository extends JpaRepository<MallAdmin, Integer> {
}