package com.learning.services;

import com.learning.model.Order;

import java.util.List;


public interface OrderService {
   List<Order> fetchAllOrders();
    /*
    Order findOrderById(int orderId);
    String addOrder(Order order);
    String deleteOrder(int orderId);
     */

}
