package com.emrecanyilmaz.utils;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestRootEntity<T>{
	
private Integer status;

private T payload;

private String errorMessage;

public static <T> RestRootEntity<T> ok(T payload) {
	RestRootEntity<T> rootEntity = new RestRootEntity<>();
	rootEntity.setPayload(payload);
	rootEntity.setErrorMessage(null);
	rootEntity.setStatus(HttpStatus.OK.value());
	
	return rootEntity;
}

public static <T> RestRootEntity<T> error(String errorMessage) {
	RestRootEntity<T> rootEntity = new RestRootEntity<>();
	rootEntity.setPayload(null);
	rootEntity.setErrorMessage(errorMessage);
	rootEntity.setStatus(HttpStatus.BAD_REQUEST.value());
	
	return rootEntity;
}



}
