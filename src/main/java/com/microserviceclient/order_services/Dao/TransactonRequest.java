package com.microserviceclient.order_services.Dao;

import com.microserviceclient.order_services.Entity.Orders;
import jakarta.persistence.criteria.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
@NoArgsConstructor
public class TransactonRequest {
   private Orders order;
    private Payment payment;

}
