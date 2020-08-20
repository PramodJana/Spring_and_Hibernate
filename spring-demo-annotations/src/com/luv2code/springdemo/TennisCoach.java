package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("restFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor
	public TennisCoach() {
		System.out.println("Inside default constructor : TennisCoach");
	}
	
//	DEFINE MY INIT METHOD
	@PostConstruct
	public void doMyStartupStuff()
	{
		System.out.println(">>TennisCoach: inside of doMyStartupStuff()");
	}
	
//	DEFINE MY DESTROY METHOD
	@PreDestroy
	public void doMyCleanupStuff()
	{
		System.out.println(">>TennisCoach: inside of doMyCleanupStuff()");
	}
	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
//	
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService theFortuneService) {
//		System.out.println("Inside doSomeCrazyStuff method : TennisCoach");
//		fortuneService = theFortuneService;
//	}
	
	
	
	@Override
	public String getDailyWorkout() {
		return "practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
