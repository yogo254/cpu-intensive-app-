package com.yogo.cpuintensiveapp.factorial;

import java.math.BigInteger;

import org.springframework.stereotype.Service;

@Service
public class FactorialServiceImpl implements FactorialService {

	@Override
	public BigInteger calculateFactorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
		}

		if (n == 0 || n == 1) {
			return BigInteger.ONE;
		}

		BigInteger result = BigInteger.ONE;
		for (int i = 2; i <= n; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}

		return result;
	}

}
