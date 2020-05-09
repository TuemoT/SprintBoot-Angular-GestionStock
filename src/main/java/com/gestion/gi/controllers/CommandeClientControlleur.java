package com.gestion.gi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.gi.repository.ClientRepository;
import com.gestion.gi.repository.CommandeClientRepository;
import com.gestion.gi.repository.LigneCmdCltRepository;
import com.gestion.gi.repository.ProductRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(value="/api/v1")
public class CommandeClientControlleur {
	
	 @Autowired
	    private ProductRepository productRepository;
	    @Autowired
	    private ClientRepository clientRepository;
	    @Autowired
	    private CommandeClientRepository commandeClientRepository;
	    @Autowired
	    private LigneCmdCltRepository ligneCmdCltRepository;
	    

	    
	    @PostMapping("/orders")
	    public Order saveOrder(@RequestBody OrderForm orderForm){
	        Client client=new Client();
	        client.setName(orderForm.getClient().getName());
	        client.setEmail(orderForm.getClient().getEmail());
	        client.setAddress(orderForm.getClient().getAddress());
	        client.setPhoneNumber(orderForm.getClient().getPhoneNumber());
	        client.setUsername(orderForm.getClient().getUsername());
	        client=clientRepository.save(client);
	        System.out.println(client.getId());

	        Order order=new Order();
	        order.setClient(client);
	        order.setDate(new Date());
	        order=orderRepository.save(order);
	        double total=0;
	        for(OrderProduct p:orderForm.getProducts()){
	            OrderItem orderItem=new OrderItem();
	            orderItem.setOrder(order);
	            Product product=productRepository.findById(p.getId()).get();
	            orderItem.setProduct(product);
	            orderItem.setPrice(product.getCurrentPrice());
	            orderItem.setQuantity(p.getQuantity());
	            orderItemRepository.save(orderItem);
	            total+=p.getQuantity()*product.getCurrentPrice();
	        }
	        order.setTotalAmount(total);
	        return orderRepository.save(order);
	    }
	    
}
