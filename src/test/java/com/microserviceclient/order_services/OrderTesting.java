package com.microserviceclient.order_services;

import com.microserviceclient.order_services.Repo.OrdersRepo;
import com.microserviceclient.order_services.Service.OrderService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OrderTesting {
@Mock
OrderService service;

@InjectMocks
  OrdersRepo repo;
}
