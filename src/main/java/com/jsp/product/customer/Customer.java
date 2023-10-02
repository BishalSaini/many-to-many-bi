package com.jsp.product.customer;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Customer {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	private String name;
    private String email; 
    private long cno; 
    
    
    @ManyToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Product> product;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getCno() {
		return cno;
	}

	public void setCno(long cno) {
		this.cno = cno;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	} 
    
    
}
