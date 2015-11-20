package com.se.sampleApp.internal;

import com.se.sampleApp.domain.Customer;
import com.se.sampleApp.internal.dao.CustomerDao;

public class CustomerBean {

	public Customer save(Customer customer) {
		if (customer == null) {
			throw new IllegalArgumentException();
		}
		// Call customer dao and save

		CustomerDao customerDao = new CustomerDao();
		return customerDao.save(customer);

	}
}
