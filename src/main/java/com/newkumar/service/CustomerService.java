package com.newkumar.service;

import java.util.List;

import com.newkumar.model.CustomerMaster;

public interface CustomerService {
	 	CustomerMaster save(CustomerMaster employee);

	 	CustomerMaster getCustomer(int id);
	 	
	 	CustomerMaster deleteCustomer(int id);
	 	
	    List<CustomerMaster> getList();
}
