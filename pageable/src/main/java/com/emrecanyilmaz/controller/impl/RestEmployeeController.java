package com.emrecanyilmaz.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emrecanyilmaz.controller.IRestEmployeeController;
import com.emrecanyilmaz.model.Employee;
import com.emrecanyilmaz.service.IEmployeeService;
import com.emrecanyilmaz.utils.RestPageableRequest;

@Controller
@RequestMapping("/rest/api/employee")
public class RestEmployeeController extends RestBaseController implements IRestEmployeeController {

	@Autowired
	private IEmployeeService employeeService;

	@GetMapping("/list/pageable")
	@Override
	public Page<Employee> findAllPageable(RestPageableRequest request) {
		return employeeService.findAllPageable(toPageable(request));
	}
	

	
}
