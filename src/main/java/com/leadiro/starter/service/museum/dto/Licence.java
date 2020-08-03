package com.leadiro.starter.service.museum.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Licence {
	
	private String name;
	private String shortName;
	private String uri;

}