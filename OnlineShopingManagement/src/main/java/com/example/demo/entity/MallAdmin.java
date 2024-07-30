package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "MallAdmin")
public class MallAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String password;
    private String phone;
    
    @ManyToOne
    @JoinColumn(name = "mall_id")
    private Mall mall;

    // Constructor
    public MallAdmin() {}

    public MallAdmin(String name, String password, String phone, Mall mall) {
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.mall = mall;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public Mall getMall() {
        return mall;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMall(Mall mall) {
        this.mall = mall;
    }

    // toString() method
    @Override
    public String toString() {
        return "MallAdmin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", mall=" + mall +
                '}';
    }
}