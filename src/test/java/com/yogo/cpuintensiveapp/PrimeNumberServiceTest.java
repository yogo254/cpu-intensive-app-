package com.yogo.cpuintensiveapp;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yogo.cpuintensiveapp.prime.PrimeNumberService;

@SpringBootTest
public class PrimeNumberServiceTest {
	@Autowired
	private PrimeNumberService primeNumberService;

	@Test
	void isPrimeNumber(){
		boolean prime = primeNumberService.isPrime(31);
		assertTrue(prime,"31 is a prime number");
		prime = primeNumberService.isPrime(49);
		assertTrue(!prime,"49 is not a prime number");

	}
	
}
