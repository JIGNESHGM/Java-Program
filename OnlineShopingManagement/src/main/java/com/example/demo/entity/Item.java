package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String itemName;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private Date manufacturingDate;

    @Column(nullable = false)
    private Date expiry;

    @Column(nullable = false)
    private String category;

    public Item() {}

    public Item(String itemName, double price, Date manufacturingDate, Date expiry, String category) {
        this.itemName = itemName;
        this.price = price;
        this.manufacturingDate = manufacturingDate;
        this.expiry = expiry;
        this.category = category;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Item [id=" + id + ", itemName=" + itemName + ", price=" + price + ", manufacturingDate=" + manufacturingDate + ", expiry=" + expiry + ", category=" + category + "]";
    }
}
