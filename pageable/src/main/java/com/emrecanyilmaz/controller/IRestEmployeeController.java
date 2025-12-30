package com.emrecanyilmaz.controller;

import org.springframework.data.domain.Page;

import com.emrecanyilmaz.model.Employee;
import com.emrecanyilmaz.utils.RestPageableRequest;

public interface IRestEmployeeController {

	public Page<Employee> findAllPageable(RestPageableRequest request);
}
