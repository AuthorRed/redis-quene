package com.boot.study.config;

import java.io.Serializable;

import lombok.Data;


public class Hello implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5681124471306722859L;
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
