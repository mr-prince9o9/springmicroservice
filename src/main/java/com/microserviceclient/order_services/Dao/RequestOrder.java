package com.microserviceclient.order_services.Dao;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestOrder {

    @NotBlank(message = "value should be entered")
    private String name;

    @NotBlank(message = "value should be entered")
    @NotNull(message = "value should not null")
    private int quantity;
    @Size(min = 200,max = 50000)
    private double price;
}
