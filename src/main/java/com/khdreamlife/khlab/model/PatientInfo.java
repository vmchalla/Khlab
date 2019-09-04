package com.khdreamlife.khlab.model;

import java.time.LocalDate;

public class PatientInfo {
	
	String name;
	LocalDate dob;
	String barcode;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDate() {
		return dob;
	}
	public void setDate(LocalDate date) {
		this.dob = date;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
	

}
