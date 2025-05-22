package com.AddressBookApp.dto;

import lombok.Data;

@Data
public class AddressBookDTO {
    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    AddressBookDTO(String name, String address, String city, String state, String zip, String phone){
    	this.name = name;
    	this.address = address;
    	this.city = city;
    	this.state = state;
    	this.zip = zip;
    	this.phone = phone;
    }
    public String getName() {
    	return name;
    }
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZip() {
		return zip;
	}
	public String getPhone() {
		return phone;
	}
}