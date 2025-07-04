package com.microserviceclient.order_services.Controller;


import com.microserviceclient.order_services.Dao.RequestOrder;
import com.microserviceclient.order_services.Dao.TransactionResponse;
import com.microserviceclient.order_services.Dao.TransactonRequest;
import com.microserviceclient.order_services.Entity.Orders;
import com.microserviceclient.order_services.Service.OrderService;
import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrdersController

{

    @Autowired
    OrderService orderService;

    @PostMapping("/addorder")
    public TransactionResponse addORDER(@RequestBody TransactonRequest order)
    {
return orderService.addOrder(order);

    }


    @GetMapping("/getEployee/{id}")
    public Orders getOrderById(@PathVariable("id") int id)
    {
        return orderService.getOrderById(id);
    }
}

