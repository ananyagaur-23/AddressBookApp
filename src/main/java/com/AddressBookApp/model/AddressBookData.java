package com.AddressBookApp.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressBookData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    
    
    public AddressBookData()
    {}
    
    AddressBookData(String name, String address, String city, String state, String zip, String phone){
    	this.name = name;
    	this.address = address;
    	this.city = city;
    	this.state = state;
    	this.zip = zip;
    	this.phone = phone;
    }
    public AddressBookData(int id, String name, String address, String city, String state, String zip, String phone) {
        this.id = id;
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