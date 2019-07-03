package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DTO")
public class User {
	@Id
	
private int id;
private String  name;

private String address;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getMobileno() {
	return mobileno;
}

public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}

private String mobileno;
}
