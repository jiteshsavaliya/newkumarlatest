package com.newkumar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.newkumar.model.CustomerMaster;

public interface CustomerRepository extends JpaRepository<CustomerMaster, String>{
	public CustomerMaster findById(int id);

	@Modifying 
	@Query(value="delete from CustomerMaster c where c.id = ?1")
	void deleteById(int id);
}