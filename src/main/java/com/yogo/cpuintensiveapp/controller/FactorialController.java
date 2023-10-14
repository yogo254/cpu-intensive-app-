package com.yogo.cpuintensiveapp.controller;

import java.math.BigInteger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yogo.cpuintensiveapp.factorial.FactorialService;

@RestController
@RequestMapping("/factorial")
public class FactorialController {
	private FactorialService factorialService;

	public FactorialController(FactorialService factorialService) {
		this.factorialService = factorialService;
	}

	public BigInteger calculateFactorial( @RequestParam int number){
		return factorialService.calculateFactorial(number);
	}
	
	
}
