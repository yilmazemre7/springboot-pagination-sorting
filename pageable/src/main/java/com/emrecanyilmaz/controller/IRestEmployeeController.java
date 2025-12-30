package com.emrecanyilmaz.controller;

import org.springframework.data.domain.Page;

import com.emrecanyilmaz.dto.DtoEmployee;
import com.emrecanyilmaz.model.Employee;
import com.emrecanyilmaz.utils.RestPageableEntity;
import com.emrecanyilmaz.utils.RestPageableRequest;

public interface IRestEmployeeController {

	public RestPageableEntity<DtoEmployee> findAllPageable(RestPageableRequest request);
}
