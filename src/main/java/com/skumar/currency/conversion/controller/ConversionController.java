package com.skumar.currency.conversion.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversionController {

	@Autowired
	CurrencyConversionProxy proxyService;
	
	@Autowired
	CurrencyConversionDelegate currencyConversionDelegate;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping(path = "/conversion/{amount}")
	public Conversion getCurrencyConversionFactor(@PathVariable Integer amount)
	{
		logger.debug("Executing Convertion Currency"); 
		
		ConversionFactorResponse conversionFactorResponse = currencyConversionDelegate.getConversionFactor("USD");
		Conversion conversion = new Conversion(conversionFactorResponse.getId(), conversionFactorResponse.getCurrency(), conversionFactorResponse.getCountry(), conversionFactorResponse.getConversionFactor(), conversionFactorResponse.getConversionFactor()*amount);
		
		return conversion;
	}
	
}
