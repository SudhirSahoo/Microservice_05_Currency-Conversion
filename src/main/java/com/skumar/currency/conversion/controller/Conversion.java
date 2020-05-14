package com.skumar.currency.conversion.controller;

public class Conversion {

	private Long id;
	private String currency;
	private String country;	
	private Integer conversionFactor;
	private Integer amount;
	
	public Conversion() {
		super();
	}


	public Conversion(Long id, String currency, String country, Integer conversionFactor, Integer amount) {
		super();
		this.id = id;
		this.currency = currency;
		this.country = country;
		this.conversionFactor = conversionFactor;
		this.amount = amount;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getConversionFactor() {
		return conversionFactor;
	}
	public void setConversionFactor(Integer conversionFactor) {
		this.conversionFactor = conversionFactor;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
}
