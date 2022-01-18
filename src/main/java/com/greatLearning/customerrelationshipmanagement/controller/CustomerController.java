package com.greatLearning.customerrelationshipmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatLearning.customerrelationshipmanagement.entity.Customer;
import com.greatLearning.customerrelationshipmanagement.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/")
	public String welcome() {
		return "index";
	}

	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		System.out.println("request recieved");
		List<Customer> theCustomers = customerService.findAll();
		theModel.addAttribute("Customers", theCustomers);
		System.out.println(theCustomers);
		return "list-customers";
	}

	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		Customer customer = new Customer();
		theModel.addAttribute("Customer", customer);
		return "customer-Form";
	}

	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId, Model theModel) {

		Customer customer = customerService.findById(theId);
		theModel.addAttribute("Customer", customer);
		return "customer-Form";

	}

	@PostMapping("/save")
	public String saveCustomer(@RequestParam("id") int id, @RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("email") String email) {
		Customer theCustomer;
		if (id != 0) {
			theCustomer = customerService.findById(id);
			theCustomer.setFirstName(firstName);
			theCustomer.setLastName(lastName);
			theCustomer.setEmail(email);
		} else {
			theCustomer = new Customer(firstName, lastName, email);
			customerService.save(theCustomer);
		}
		return "redirect:/list";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam("customerId") int theId) {

		customerService.deleteById(theId);

		
		return "redirect:/list";
	}
}
