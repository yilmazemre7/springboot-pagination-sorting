package com.emrecanyilmaz.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.emrecanyilmaz.dto.DtoEmployee;
import com.emrecanyilmaz.model.Employee;

public interface IEmployeeService {

	 Page<Employee> findAllPageable(Pageable request);
	
	 List<DtoEmployee> toDTOList(List<Employee> employeeList);
	
}
