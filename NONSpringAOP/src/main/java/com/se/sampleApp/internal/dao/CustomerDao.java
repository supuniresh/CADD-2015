package com.se.sampleApp.internal.dao;

import com.se.sampleApp.domain.Customer;

public class CustomerDao {

	public Customer save(Customer customer) {
		customer.setCustomerId("100");
		return customer;
	}

}
