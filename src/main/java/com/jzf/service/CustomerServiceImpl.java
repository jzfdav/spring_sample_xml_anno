package com.jzf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jzf.model.Customer;
import com.jzf.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	//@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	public CustomerServiceImpl (CustomerRepository customerRepository) {
		System.out.println("Constructor Injection");
		this.customerRepository = customerRepository;
	}

	//@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		
		System.out.println("Setter Injection Used");
		this.customerRepository = customerRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jzf.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
