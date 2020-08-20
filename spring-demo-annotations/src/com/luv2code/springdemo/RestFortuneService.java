package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {

//	create an array of strings

	private String[] data= {
		"sia is great",
		"shivani is great",
		"shiv is worst"
	};
	
//	create a random number generator

	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		// pick a random string from array
		int index = myRandom.nextInt(data.length);
		String theFortune= data[index];
		
		return theFortune;
	}

}
