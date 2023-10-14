package com.yogo.cpuintensiveapp.prime;

import org.springframework.stereotype.Service;

@Service
public class PrimeServiceImpl implements PrimeNumberService {

	@Override
	public boolean isPrime(int number) {
		if (number <= 1) {
            return false;
        }
		if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

		return true;
	}

	@Override
	public int findLargestPrimeBetween(int start, int end) {
		int largestPrime = -1;
        for (int i = end; i >= start; i--) {
            if (isPrime(i)) {
                largestPrime = i;
                break; // Found the largest prime, exit the loop
            }
        }
        return largestPrime;
	}
	
}
