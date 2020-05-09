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
import com.gestion.gi.entities.Fournisseur;
import com.gestion.gi.exception.ResourceNotFoundException;
import com.gestion.gi.repository.ClientRepository;
import com.gestion.gi.repository.FournisseurRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(value="/api/v1")
public class FournisseurControlleur {
	
	@Autowired
	private FournisseurRepository fournisseurRepository;
	
	
	public  FournisseurControlleur( FournisseurRepository fournisseurRepository) {
		// TODO Auto-generated constructor stub
		this.fournisseurRepository= fournisseurRepository;
	}
		
	
	@GetMapping("/fournisseurs")
    public List<Fournisseur> getAllFournisseur() {
        return fournisseurRepository.findAll();
	}


    @GetMapping("/fournisseur/{idFourniseur}")
    public ResponseEntity<Fournisseur> getFournissueurById(@PathVariable(value = "id") Long idFournisseur)
        throws ResourceNotFoundException {
        Fournisseur fournisseur = fournisseurRepository.findById(idFournisseur)
          .orElseThrow(() -> new ResourceNotFoundException("Fournisseur  not found for this id :: " + idFournisseur));
        return ResponseEntity.ok().body(fournisseur);
    }
    
    @PostMapping("/addFournisseur")  
    public Fournisseur createFournisseur(@Valid @RequestBody Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur);
    }
    

    @PutMapping("/fournisseur/{idFournisseur}")
    public ResponseEntity<Fournisseur> updatedFournisseur(@PathVariable(value = "id") Long idFournisseur,
         @Valid @RequestBody Fournisseur fournisseurDetails) throws ResourceNotFoundException {
        Fournisseur fournisseur = fournisseurRepository.findById(idFournisseur)
        .orElseThrow(() -> new ResourceNotFoundException("Fournisseur not found for this id :: " + idFournisseur));

        fournisseur.setNom(fournisseurDetails.getNom());
        fournisseur.setPrenom(fournisseurDetails.getPrenom());
        fournisseur.setAdresse(fournisseurDetails.getAdresse());
        fournisseur.setPhoto(fournisseurDetails.getPhoto());
        fournisseur.setMail(fournisseurDetails.getMail());
        final Fournisseur updatedFournisseur= fournisseurRepository.save(fournisseur);
        return ResponseEntity.ok(updatedFournisseur);
    } 
    @DeleteMapping("/fournisseurs/{idFournisseur}")
    public Map<String, Boolean> deleteClient(@PathVariable(value = "id") Long idFournisseur)
         throws ResourceNotFoundException {
      Fournisseur fournisseur =fournisseurRepository.findById(idFournisseur)
       .orElseThrow(() -> new ResourceNotFoundException("Fournisseur  not found for this id :: " + idFournisseur));

        fournisseurRepository.delete(fournisseur);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }


}
