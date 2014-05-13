package com.amazoncode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	static int getNumberOfPrimes(int N) {
		int  cnt=1;
		
		if ( N < 2 ) {
            System.out.println("\n There are no Prime Numbers available");
            System.exit(0);
        }
		 for (int i = 3; i <= N; i++) {
	            if ( isPrime(i) ) {
	            	cnt++;
	            }
	        }
	      return  cnt;
	}
	 public static boolean isPrime(int num) {
	        if ( num < 2 ) return false;
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if ( num % i == 0 ) {
	                return false;
	            }
	        }
	        return true;
	    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;
		int _a;
		_a = in.nextInt();
		res = getNumberOfPrimes(_a);
		System.out.println(res);
	}
}