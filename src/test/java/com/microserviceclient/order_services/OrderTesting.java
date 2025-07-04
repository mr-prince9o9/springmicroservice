package com.microserviceclient.order_services;

import com.microserviceclient.order_services.Dao.TransactonRequest;
import com.microserviceclient.order_services.Entity.Orders;
import com.microserviceclient.order_services.Repo.OrdersRepo;
import com.microserviceclient.order_services.Service.OrderService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OrderTesting {
@Mock
OrderService service;

@InjectMocks
  OrdersRepo repo;

@Test
public void saveOrder(Orders order) {

  Orders savedOrder = new Orders(22,"ram",22,5000.0);

  when(repo.save(order)).thenReturn(savedOrder);

  TransactonRequest request = new TransactonRequest();
  request.setOrder(savedOrder);

  service.addOrder(request);

  assertEquals(request.getOrder().getName(), order.getName());

}
}

