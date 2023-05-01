package com.ramesh.java;

public class Address {
	
	String doreNo;
	
	String streetName;
	
	String city;
	
	String district;
	
	String state;
	
	String pincode;

	public String getDoreNo() {
		return doreNo;
	}

	public void setDoreNo(String doreNo) {
		this.doreNo = doreNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [doreNo=" + doreNo + ", streetName=" + streetName + ", city=" + city + ", district=" + district
				+ ", state=" + state + ", pincode=" + pincode + "]";
	}

}
