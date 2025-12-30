package com.emrecanyilmaz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.emrecanyilmaz.model.Employee;
import com.emrecanyilmaz.repository.EmployeeRepository;
import com.emrecanyilmaz.service.IEmployeeService;
import com.emrecanyilmaz.utils.RestPageableRequest;
@Service
public class EmployeeService implements IEmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;


	@Override
	public Page<Employee> findAllPageable(Pageable pageable) {
		return employeeRepository.findAllPageable(pageable);
	}
	
}

