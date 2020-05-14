package com.skumar.currency.conversion.controller;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient("zuul-gateway") 
@RibbonClient("currency-conversion-factor")
public interface CurrencyConversionProxy {

	 @GetMapping(path = "/currency-conversion-factor/conversionfactor/{currency}")
	  public ConversionFactorResponse getCurrencyConversionFactor(@PathVariable	 String currency);
	 

}