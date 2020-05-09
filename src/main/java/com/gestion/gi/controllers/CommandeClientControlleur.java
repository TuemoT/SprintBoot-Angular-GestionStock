package com.gestion.gi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.gi.entities.Client;
import com.gestion.gi.entities.CommandeClient;
import com.gestion.gi.entities.CommandeForm;
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
	    

		/*
		 * @PostMapping("/commandesClients") public CommandeClient
		 * saveCommande(@RequestBody CommandeForm commandeForm){ Client client=new
		 * Client(); client.setName(commandeForm.getClient().getName());
		 * client.setEmail(commandeForm.getClient().getEmail());
		 * client.setAddress(orderForm.getClient().getAddress());
		 * client.setPhoneNumber(commandeForm.getClient().getPhoneNumber());
		 * client.setUsername(commandeForm.getClient().getUsername());
		 * client=clientRepository.save(client); System.out.println(client.getId());
		 * 
		 * Order order=new Order(); order.setClient(client); order.setDate(new Date());
		 * order=orderRepository.save(order); double total=0; for(OrderProduct
		 * p:orderForm.getProducts()){ OrderItem orderItem=new OrderItem();
		 * orderItem.setOrder(order); Product
		 * product=productRepository.findById(p.getId()).get();
		 * orderItem.setProduct(product); orderItem.setPrice(product.getCurrentPrice());
		 * orderItem.setQuantity(p.getQuantity()); orderItemRepository.save(orderItem);
		 * total+=p.getQuantity()*product.getCurrentPrice(); }
		 * order.setTotalAmount(total); return orderRepository.save(order); }
		 */
}
