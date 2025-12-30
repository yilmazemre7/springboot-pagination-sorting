package com.emrecanyilmaz.controller.impl;

import org.springframework.data.domain.Pageable;

import com.emrecanyilmaz.utils.PagerUtils;
import com.emrecanyilmaz.utils.RestPageableRequest;

public class RestBaseController {

	public Pageable toPageable(RestPageableRequest request) {
		return PagerUtils.toPageable(request);
	}
}
