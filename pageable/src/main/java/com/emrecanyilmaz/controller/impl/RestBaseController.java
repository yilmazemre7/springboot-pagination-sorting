package com.emrecanyilmaz.controller.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.emrecanyilmaz.utils.PagerUtils;
import com.emrecanyilmaz.utils.RestPageableEntity;
import com.emrecanyilmaz.utils.RestPageableRequest;

public class RestBaseController {

	public Pageable toPageable(RestPageableRequest request) {
		return PagerUtils.toPageable(request);
	}
	
	public <T> RestPageableEntity<T> toPageableResponse(Page<?> page, List<T> content) {
		return PagerUtils.toPageableResponse(page,content);
	}
}
