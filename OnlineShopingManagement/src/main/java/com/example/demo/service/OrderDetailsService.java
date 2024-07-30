package com.example.demo.service;

import com.example.demo.entity.OrderDetails;
import com.example.demo.repository.OrderDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailsService {

    private final OrderDetailsRepository orderDetailsRepository;

    @Autowired
    public OrderDetailsService(OrderDetailsRepository orderDetailsRepository) {
        this.orderDetailsRepository = orderDetailsRepository;
    }

    public List<OrderDetails> getAllOrderDetails() {
        return orderDetailsRepository.findAll();
    }

    public OrderDetails createOrderDetails(OrderDetails orderDetails) {
        return orderDetailsRepository.save(orderDetails);
    }

    public OrderDetails getOrderDetailsById(Long id) {
        return orderDetailsRepository.findById(id).orElse(null);
    }

    public OrderDetails updateOrderDetails(Long id, OrderDetails orderDetails) {
        OrderDetails existingOrderDetails = getOrderDetailsById(id);
        if (existingOrderDetails != null) {
            existingOrderDetails.setDateOfPurchase(orderDetails.getDateOfPurchase());
            existingOrderDetails.setTotal(orderDetails.getTotal());
            existingOrderDetails.setCustomer(orderDetails.getCustomer());
            existingOrderDetails.setPaymentMode(orderDetails.getPaymentMode());
            return orderDetailsRepository.save(existingOrderDetails);
        }
        return null;
    }

    public void deleteOrderDetails(Long id) {
        orderDetailsRepository.deleteById(id);
    }
}