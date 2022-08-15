package com.learning.services;

import com.learning.model.GetResponseForOrderList;
import com.learning.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.learning.repositries.OrdersRepository;


import java.util.*;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrdersRepository ordersRepository;

  /*public GetResponseForOrderList retrieveOrdersList(){

        List<Order> orderList = new ArrayList<Order>();
        orderList.add(new Order(100,1000,"Sravan",01,100, new Date()));
        orderList.add(new Order(101,1001,"SravanG",02,110, new Date()));
        orderList.add(new Order(102,1002,"SravanK",03,100, new Date()));
        orderList.add(new Order(103,1001,"SravanG",01,100, new Date()));

        GetResponseForOrderList getResponseForOrderListSvc = new GetResponseForOrderList();
        getResponseForOrderListSvc.setOrderList(orderList);
        return getResponseForOrderListSvc;

    }

    public GetResponseForOrderList retrieveOrdersList(int orderId){

        List<Order> orderList = new ArrayList<Order>();
        orderList.add(new Order(100,1000,"Sravan",01,100, new Date()));
        orderList.add(new Order(101,1001,"SravanG",02,110, new Date()));
        orderList.add(new Order(102,1002,"SravanK",03,100, new Date()));
        orderList.add(new Order(103,1001,"SravanG",01,100, new Date()));

        for (int i=0; i < orderList.size(); i++) {
            if(orderList.get(i).getOrderId() == orderId){
                List<Order> orderLst = new ArrayList<Order>();
                orderLst.add(orderList.get(i));

                GetResponseForOrderList result = new GetResponseForOrderList();
                result.setOrderList(orderLst);

                return result;

            }

        }
        GetResponseForOrderList getResponseForOrderListSvc = new GetResponseForOrderList();
        getResponseForOrderListSvc.setOrderList(orderList);
        return getResponseForOrderListSvc;

    }*/

    /*public String createOrder(Order order) {
        //use database for retrieval
        // dao.createOrder(order);
        return "Successfully Created Order";

        /* Using InMemory Database
        List<Order>  orderList = new ArrayList<Order>();
        orderList.add(order); */
    //}

    public List<Order> fetchAllOrders(){
        return (List<Order>) ordersRepository.findAll();
    }


}
