package com.assignment.greethello.greethello;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GreetRequest {
	@JsonProperty(value = "name")
	  private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
