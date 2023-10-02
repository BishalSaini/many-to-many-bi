package com.jsp.product.customer;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestSave { 
public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vishu");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Customer c1=new Customer(); 
		c1.setName("Vishu"); 
		c1.setEmail("vishu@mail.com"); 
		c1.setCno(123456789); 
		

		Customer c2=new Customer(); 
		c2.setName("Sabaat"); 
		c2.setEmail("sabaat@mail.com"); 
		c2.setCno(987654321); 
		

		Customer c3=new Customer(); 
		c3.setName("Akash"); 
		c3.setEmail("ak18@mail.com"); 
		c3.setCno(567894321);  
			
		
		ArrayList<Customer> customers=new ArrayList<Customer>(); 
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		

		
		Product p1=new Product(); 
		p1.setName("Laptop"); 
		p1.setPrice(45000); 
		
		Product p2=new Product(); 
		p2.setName("Headphone"); 
		p2.setPrice(2000); 
		
		Product p3=new Product(); 
		p3.setName("Tablet"); 
		p3.setPrice(25999.99); 
		
		
		Product p4=new Product(); 
		p4.setName("Mobile Phone"); 
		p4.setPrice(20000); 
		
		ArrayList<Product> product=new ArrayList<Product>(); 
		product.add(p1);
		product.add(p2);
		product.add(p3);
		product.add(p4);
		
		
		c1.setProduct(product); 
		c2.setProduct(product); 
		c3.setProduct(product); 
		
	
		p1.setCustomer(customers); 
		p2.setCustomer(customers); 
		p3.setCustomer(customers);
		p4.setCustomer(customers);

		
		entityTransaction.begin(); 
		entityManager.persist(c1); 
		entityManager.persist(c2); 
		entityManager.persist(c3);  
		entityTransaction.commit();
	} 
}
