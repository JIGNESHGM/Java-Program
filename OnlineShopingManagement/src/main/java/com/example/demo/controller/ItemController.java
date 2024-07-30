package com.example.demo.controller;

import com.example.demo.entity.Item;
import com.example.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable int id) {
        return itemService.getItemById(id);
    }

    @PostMapping
    public Item saveItem(@RequestBody Item item) {
        return itemService.saveItem(item);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable int id) {
        itemService.deleteItem(id);
    }

    @PutMapping("/{id}")
    public Item updateItem(@PathVariable int id, @RequestBody Item item) {
        Item existingItem = itemService.getItemById(id);
        if (existingItem != null) {
            existingItem.setItemName(item.getItemName());
            existingItem.setPrice(item.getPrice());
            existingItem.setManufacturingDate(item.getManufacturingDate());
            existingItem.setExpiry(item.getExpiry());
            existingItem.setCategory(item.getCategory());
            return itemService.updateItem(existingItem);
        }
        return null;
    }

    @PatchMapping("/{id}")
    public Item partiallyUpdateItem(@PathVariable int id, @RequestBody Item item) {
        Item existingItem = itemService.getItemById(id);
        if (existingItem != null) {
            if (item.getItemName() != null) {
                existingItem.setItemName(item.getItemName());
            }
            if (item.getPrice() != 0) {
                existingItem.setPrice(item.getPrice());
            }
            if (item.getManufacturingDate() != null) {
                existingItem.setManufacturingDate(item.getManufacturingDate());
            }
            if (item.getExpiry() != null) {
                existingItem.setExpiry(item.getExpiry());
            }
            if (item.getCategory() != null) {
                existingItem.setCategory(item.getCategory());
            }
            return itemService.updateItem(existingItem);
        }
        return null;
    }
}
