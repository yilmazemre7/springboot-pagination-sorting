package com.emrecanyilmaz.controller;

import org.springframework.data.domain.Page;

import com.emrecanyilmaz.dto.DtoEmployee;
import com.emrecanyilmaz.model.Employee;
import com.emrecanyilmaz.utils.RestPageableEntity;
import com.emrecanyilmaz.utils.RestPageableRequest;
import com.emrecanyilmaz.utils.RestRootEntity;

public interface IRestEmployeeController {

	public RestRootEntity<RestPageableEntity<DtoEmployee>> findAllPageable(RestPageableRequest request);
}
