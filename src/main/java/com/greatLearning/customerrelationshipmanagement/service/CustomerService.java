package com.greatLearning.customerrelationshipmanagement.service;

import java.util.List;

import com.greatLearning.customerrelationshipmanagement.entity.Customer;

public interface CustomerService {
	
	public List<Customer> findAll();
	
	public Customer findById(int theId);
	
	public void  save(Customer customer);
	
	public void deleteById(int theId);

}
