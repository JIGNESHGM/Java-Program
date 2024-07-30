package com.example.demo.service;

import com.example.demo.entity.Shop;
import com.example.demo.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopService {

    @Autowired
    private ShopRepository shopRepository;

    public List<Shop> getAllShops() {
        return shopRepository.findAll();
    }

    public Optional<Shop> getShopById(Long id) {
        return shopRepository.findById(id);
    }

    public Shop createShop(Shop shop) {
        return shopRepository.save(shop);
    }

    public Shop updateShop(Long id, Shop shopDetails) {
        Optional<Shop> optionalShop = shopRepository.findById(id);
        if (optionalShop.isPresent()) {
            Shop shop = optionalShop.get();
            shop.setShopCategory(shopDetails.getShopCategory());
            shop.setShopEmployees(shopDetails.getShopEmployees());
            shop.setShopName(shopDetails.getShopName());
            shop.setShopStatus(shopDetails.getShopStatus());
            shop.setShopOwner(shopDetails.getShopOwner());
            shop.setLeaseStatus(shopDetails.getLeaseStatus());
            return shopRepository.save(shop);
        }
        return null;
    }

    public boolean deleteShop(Long id) {
        Optional<Shop> optionalShop = shopRepository.findById(id);
        if (optionalShop.isPresent()) {
            shopRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
