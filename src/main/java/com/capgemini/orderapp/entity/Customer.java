package com.capgemini.orderapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "customer")
public class Customer {
	@Id
    private int customerId;
	private String customerPassword;
	private String customerFirstName;
	private String customerLastName;
	private String customerStreet;
	private String customerCity;
	private String customerState;
	private String customerZip;
	private String customerCountry;
	
	public Customer(int customerId, String customerPassword, String customerFirstName, String customerLastName,
			String customerStreet, String customerCity, String customerState, String customerZip,
			String customerCountry) {
		super();
		this.customerId = customerId;
		this.customerPassword = customerPassword;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		
		this.customerStreet = customerStreet;
		this.customerCity = customerCity;
		this.customerState = customerState;
		this.customerZip = customerZip;
		this.customerCountry = customerCountry;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCustomerStreet() {
		return customerStreet;
	}

	public void setCustomerStreet(String customerStreet) {
		this.customerStreet = customerStreet;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public String getCustomerState() {
		return customerState;
	}

	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}

	public String getCustomerZip() {
		return customerZip;
	}

	public void setCustomerZip(String customerZip) {
		this.customerZip = customerZip;
	}

	public String getCustomerCountry() {
		return customerCountry;
	}

	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerPassword=" + customerPassword + ", customerFirstName="
				+ customerFirstName + ", customerLastName=" + customerLastName + ", customerStreet=" + customerStreet
				+ ", customerCity=" + customerCity + ", customerState=" + customerState + ", customerZip=" + customerZip
				+ ", customerCountry=" + customerCountry + "]";
	}
	
	
}


