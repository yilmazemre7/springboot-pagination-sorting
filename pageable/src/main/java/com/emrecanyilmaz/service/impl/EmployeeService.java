package com.emrecanyilmaz.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.emrecanyilmaz.dto.DtoDepartment;
import com.emrecanyilmaz.dto.DtoEmployee;
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


	@Override
	public List<DtoEmployee> toDTOList(List<Employee> employeeList) {

		List<DtoEmployee> dtoEmployeeList = new ArrayList<>();
		for (Employee employee : employeeList) {
			DtoEmployee dtoEmployee = new DtoEmployee();
			DtoDepartment dtoDepartment = new DtoDepartment();
			BeanUtils.copyProperties(employee, dtoEmployee);
			BeanUtils.copyProperties(employee.getDepartment(), dtoDepartment);
			dtoEmployee.setDepartment(dtoDepartment);
			dtoEmployeeList.add(dtoEmployee);
		}
		return dtoEmployeeList;
	}
	
}

