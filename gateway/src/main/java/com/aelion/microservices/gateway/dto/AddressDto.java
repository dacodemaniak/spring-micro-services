package com.aelion.microservices.gateway.dto;

public class AddressDto {
	private String id;
	private String streetNumber;
	private String streetName;
	private String streetCpl;
	private String building;
	private String stair;
	private String apptNumber;
	private String zipCode;
	private String city;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getStreetCpl() {
		return streetCpl;
	}
	public void setStreetCpl(String streetCpl) {
		this.streetCpl = streetCpl;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getStair() {
		return stair;
	}
	public void setStair(String stair) {
		this.stair = stair;
	}
	public String getApptNumber() {
		return apptNumber;
	}
	public void setApptNumber(String apptNumber) {
		this.apptNumber = apptNumber;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
