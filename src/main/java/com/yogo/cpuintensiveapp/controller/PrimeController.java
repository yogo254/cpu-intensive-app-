package com.yogo.cpuintensiveapp.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yogo.cpuintensiveapp.prime.PrimeNumberService;

@RestController
@RequestMapping("/prime")
public class PrimeController {

	private PrimeNumberService primeNumberService;

	public PrimeController(PrimeNumberService primeNumberService) {
		this.primeNumberService = primeNumberService;
	}

	@GetMapping("/isPrime")
	public boolean isPrime(@RequestParam Integer number) {
		return primeNumberService.isPrime(number);
	}

	@GetMapping("/maxPrime")
	public Integer maxPrime(@RequestParam Optional<Integer> min, @RequestParam Integer max) {
		return primeNumberService.findLargestPrimeBetween(min.orElse(0), max);
	}

}
