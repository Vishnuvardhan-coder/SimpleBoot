package com.trinetra.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.trinetra.entity.OrderEntity;

@Component
public class ClientRestServices implements CommandLineRunner {
public static void clientService() {
	RestTemplate template=new RestTemplate();
	OrderEntity order=template.getForObject("http://localhost:8007/ecommerceOrders/getOrderByReferenceId/16031", OrderEntity.class);
	System.out.println("order details:"+order.getNumberOfBricks());
	
}

@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	clientService();
	
}
}
