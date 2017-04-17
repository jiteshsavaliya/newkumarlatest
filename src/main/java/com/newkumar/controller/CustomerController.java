package com.newkumar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newkumar.model.CustomerMaster;
import com.newkumar.service.CustomerService;



@Controller
public class CustomerController {
	@Autowired 
	private CustomerService customerService;
	 @RequestMapping("/getcustomer")
	    String getAllCustomer(ModelMap map) {
		map.put("customerList", customerService.getList());
		map.put("customer", new CustomerMaster() );
		
	    return "customer";
	    }
	 
	 @RequestMapping("/saveCustomer")
	    String saveCustomer(@ModelAttribute("customer") CustomerMaster customerMaster) {
		customerService.save(customerMaster);	
	    return "redirect:/getcustomer";
	    }
	 @RequestMapping("/editCustomer/{customerId}")
	    String editCustomer(@PathVariable int customerId,ModelMap map) {
		 map.put("customer", customerService.getCustomer(customerId));
		 return "customer";
	    }
	 
	 @RequestMapping("/deleteCustomer/{customerId}")
	    String deleteCustomer(@PathVariable int customerId,ModelMap map) {
		 customerService.deleteCustomer(customerId);
		 return "redirect:/getcustomer";
	    }
}
