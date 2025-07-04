package com.microserviceclient.order_services.Repo;

import com.microserviceclient.order_services.Entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrdersRepo extends JpaRepository<Orders, Long> {



}
