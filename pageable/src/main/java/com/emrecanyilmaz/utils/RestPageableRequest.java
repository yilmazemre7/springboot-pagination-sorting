package com.emrecanyilmaz.utils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestPageableRequest {

	private int pageSize;
	
	private int pageNumber;
	
	private String columnName;
	
	private boolean isAsc;
}
