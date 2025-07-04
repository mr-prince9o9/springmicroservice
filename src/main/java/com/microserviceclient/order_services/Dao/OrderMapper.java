package com.microserviceclient.order_services.Dao;


import com.microserviceclient.order_services.Entity.Orders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class OrderMapper {

public static Orders convertReqtoOrdersEntity(TransactonRequest requestOrder )
{
    Orders orders = new Orders();
    orders.setName(requestOrder.getOrder().getName());
    orders.setQuantity(requestOrder.getOrder().getQuantity());
    orders.setPrice(requestOrder.getOrder().getPrice());
    return orders;
}

}
