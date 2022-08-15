package com.learning.controller;


import com.learning.model.GetResponseForOrderList;
import com.learning.model.Order;
import com.learning.services.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderServiceImpl oSvc;

    @RequestMapping("/getOrderList")
    public ResponseEntity<List<Order>> getOrderList(){

        List<Order> result = oSvc.fetchAllOrders();
        GetResponseForOrderList orderList = new GetResponseForOrderList();
        orderList.setOrderList(result);
        System.out.println(result);
        ResponseEntity<List<Order>> responseEntity = new ResponseEntity<>(result, HttpStatus.OK);
        return responseEntity;
    }

   /* @GetMapping(path = "order/{id}",
                produces = "application/json"
    )
    public GetResponseForOrderList getOrderList(@PathVariable("id") int orderId){


        GetResponseForOrderList result = oSvc.retrieveOrdersList(orderId);

        return result;

    }*/
    /*
    @PostMapping(path = "/postRequestForOrder",
                 consumes = "application/json",
                 produces = "application/json"
    )
    public String postOrderList(@RequestBody Order order){


        return oSvc.createOrder(order);

    } */

}
