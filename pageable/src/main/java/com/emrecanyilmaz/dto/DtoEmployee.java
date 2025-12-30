package com.emrecanyilmaz.dto;

import lombok.Data;

@Data
public class DtoEmployee {
	
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	private DtoDepartment department;

}
