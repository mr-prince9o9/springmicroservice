package com.microserviceclient.order_services.Dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Payment {

    private String payment_status;
    private String transaction_id;
    private long order_id;
    private double amount;
}
