package com.microserviceclient.order_services.Service;

import com.microserviceclient.order_services.Dao.*;
import com.microserviceclient.order_services.Entity.Orders;
import com.microserviceclient.order_services.Repo.OrdersRepo;
import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

@Autowired
    OrdersRepo ordersRepo;
@Autowired
    RestTemplate restTemplate;

@Transactional
    public TransactionResponse addOrder(TransactonRequest order) {

 Orders newOrder= ordersRepo.save(OrderMapper.convertReqtoOrdersEntity(order));
 order.getOrder().setId(newOrder.getId());
 Payment payment=new Payment();
        payment.setOrder_id(order.getOrder().getId());
        payment.setAmount(order.getOrder().getPrice()*order.getOrder().getQuantity());
    TransactionResponse transactionResponse=new TransactionResponse();
 Payment payment1=  restTemplate.postForObject("http://PaymentService:8082/payments/dopayment", payment, Payment.class);

 if(payment1==null)
 {
     throw new RuntimeException("Payment failed");
 }

 else{

     transactionResponse.setTransaction_id(payment1.getTransaction_id());

     transactionResponse.setOrder(order.getOrder());
     transactionResponse.setPayment_status(payment1.getPayment_status());
 }


 return transactionResponse;
    }

    public Orders getOrderById(long id) {

   return ordersRepo.findById(id).get();
    }
}
