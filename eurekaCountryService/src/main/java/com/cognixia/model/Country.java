package com.cognixia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity // this whole bean will be converted to a table with this annotation
public class Country {
	
	@GeneratedValue // is generated
	@Id // denotes primary key
	private int countryId;
	
	@NotNull
	private String countryName;
	
	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
}
