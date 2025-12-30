package com.emrecanyilmaz.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emrecanyilmaz.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

	public Page<Employee> findAllPageable(Pageable pageable);
}
