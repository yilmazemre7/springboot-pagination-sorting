package com.emrecanyilmaz.controller.impl;

import java.awt.AWTKeyStroke;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.emrecanyilmaz.utils.PagerUtils;
import com.emrecanyilmaz.utils.RestPageableEntity;
import com.emrecanyilmaz.utils.RestPageableRequest;
import com.emrecanyilmaz.utils.RestRootEntity;

public class RestBaseController {

	public Pageable toPageable(RestPageableRequest request) {
		return PagerUtils.toPageable(request);
	}

	public <T> RestPageableEntity<T> toPageableResponse(Page<?> page, List<T> content) {
		return PagerUtils.toPageableResponse(page, content);
	}

	public <T> RestRootEntity<T> ok(T payload) {
		return RestRootEntity.ok(payload);
	}

	public <T> RestRootEntity<T> error(String errorMessage) {
		return RestRootEntity.error(errorMessage);
	}
}
