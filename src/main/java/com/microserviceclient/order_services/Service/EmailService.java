package com.microserviceclient.order_services.Service;


public class EmailService {

    public String sendEmail(String email) {
        // Simulate sending a real email (just a dummy delay and print)
        System.out.println("Sending real email to: " + email);

        // Simulate time delay
        try {
            Thread.sleep(1000); // simulate delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return "Real Email Sent to " + email;
    }
}
