package com.gestion.gi.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.gi.entities.Client;
import com.gestion.gi.exception.ResourceNotFoundException;
import com.gestion.gi.repository.ClientRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(value="/api/v1")
public class ClientControlleur {
	 @Autowired
	private ClientRepository clientRepository;
	
	public ClientControlleur(ClientRepository clientRepository){
		this.clientRepository=clientRepository;
	}

	
	
	
	@GetMapping("/clients")
    public List<Client> getAllClients() {
        return clientRepository.findAll();
	}

	/*
	 * 
	 * 
	 * 
	 * @PostMapping("save-client") public Client saveClient(@RequestBody Client
	 * client) { return clientRepository.save(client);
	 * 
	 * }
	 */
	@GetMapping("cliens-list")
	public List<Client> allClients() {
		 return clientRepository.findAll();
	}
	
        
        @GetMapping("/clients/{idClient}")
        public ResponseEntity<Client> getClientById(@PathVariable(value = "id") Long idClient)
            throws ResourceNotFoundException {
            Client client = clientRepository.findById(idClient)
              .orElseThrow(() -> new ResourceNotFoundException("Client not found for this id :: " + idClient));
            return ResponseEntity.ok().body(client);
        }
        
        @PostMapping("/addClient")  
        public Client createClient(@Valid @RequestBody Client client) {
            return clientRepository.save(client);
        }
        

        @PutMapping("/clients/{idClient}")
        public ResponseEntity<Client> updateClient(@PathVariable(value = "id") Long idClient,
             @Valid @RequestBody Client clientDetails) throws ResourceNotFoundException {
            Client client = clientRepository.findById(idClient)
            .orElseThrow(() -> new ResourceNotFoundException("Client not found for this id :: " + idClient));

            client.setNom(clientDetails.getNom());
            client.setPrenom(clientDetails.getPrenom());
            client.setAdresse(clientDetails.getAdresse());
            client.setPhoto(clientDetails.getPhoto());
            client.setMail(clientDetails.getMail());
            final Client updatedClient = clientRepository.save(client);
            return ResponseEntity.ok(updatedClient);
        } 
        @DeleteMapping("/clients/{idClient}")
        public Map<String, Boolean> deleteClient(@PathVariable(value = "id") Long idClient)
             throws ResourceNotFoundException {
            Client client = clientRepository.findById(idClient)
           .orElseThrow(() -> new ResourceNotFoundException("Client not found for this id :: " + idClient));

            clientRepository.delete(client);
            Map<String, Boolean> response = new HashMap<>();
            response.put("deleted", Boolean.TRUE);
            return response;
        }
    
        
        

}
