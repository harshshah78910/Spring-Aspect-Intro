package com.harsh.aop.Aspect_intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.harsh.aop.Aspect_intro.business.Business1;

@SpringBootApplication
public class AspectIntroApplication implements CommandLineRunner{

	@Autowired
	private Business1 business1;
	
	public static void main(String[] args) {
		SpringApplication.run(AspectIntroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(business1.CalculateLogic());
	}

}
