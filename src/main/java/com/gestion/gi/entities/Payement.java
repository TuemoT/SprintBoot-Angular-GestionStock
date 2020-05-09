/**
 * 
 */
package com.gestion.gi.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author elmot
 *
 */
@Entity
public class Payement {
	 @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private Date datePayment;
	    private long cardNumber;
	    private String cardType;
	    @OneToOne
	   private CommandeClient commandeClient;
		public Payement() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Payement(Long id, Date datePayment, long cardNumber, String cardType, CommandeClient commandeClient) {
			super();
			this.id = id;
			this.datePayment = datePayment;
			this.cardNumber = cardNumber;
			this.cardType = cardType;
			this.commandeClient = commandeClient;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Date getDatePayment() {
			return datePayment;
		}
		public void setDatePayment(Date datePayment) {
			this.datePayment = datePayment;
		}
		public long getCardNumber() {
			return cardNumber;
		}
		public void setCardNumber(long cardNumber) {
			this.cardNumber = cardNumber;
		}
		public String getCardType() {
			return cardType;
		}
		public void setCardType(String cardType) {
			this.cardType = cardType;
		}
		public CommandeClient getCommandeClient() {
			return commandeClient;
		}
		public void setCommandeClient(CommandeClient commandeClient) {
			this.commandeClient = commandeClient;
		}
	  
		
		
	    
}
