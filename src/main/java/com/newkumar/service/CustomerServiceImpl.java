package com.newkumar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.newkumar.model.CustomerMaster;
import com.newkumar.repository.CustomerRepository;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	
	@Override
	public CustomerMaster save(CustomerMaster customerMaster) {
		// TODO Auto-generated method stub
		return customerRepository.save(customerMaster);
	}

	@Override
	public List<CustomerMaster> getList() {
		return (List<CustomerMaster>) customerRepository.findAll();
	}

	@Override
	public CustomerMaster getCustomer(int id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id);
	}

	@Override
	public CustomerMaster deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(id);
		return null;
	}

}
