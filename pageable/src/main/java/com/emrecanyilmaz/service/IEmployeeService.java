package com.emrecanyilmaz.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.emrecanyilmaz.model.Employee;

public interface IEmployeeService {

	public Page<Employee> findAllPageable(Pageable request);
}
