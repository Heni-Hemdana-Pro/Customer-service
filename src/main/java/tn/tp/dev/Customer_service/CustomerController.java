package tn.tp.dev.Customer_service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @PostMapping("/orders")
    public String createOrder(@RequestBody OrderDto order) {
        rabbitTemplate.convertAndSend( RabbitConfig.EXCHANGE, RabbitConfig.ROUTING_KEY, order );
        return "Commande envoyée au broker RabbitMQ";
    }
}

