package com.microserviceclient.order_services.Dao;

import com.microserviceclient.order_services.Entity.Orders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {
    private Orders order;
   private String payment_status;
   private String transaction_id;
}
