package com.harsh.aop.Aspect_intro.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harsh.aop.Aspect_intro.data.Dao1;

@Service
public class Business1 {

	@Autowired
	private Dao1 dao1;
	
	public String CalculateLogic()
	{
		return dao1.retrieveFromDB();
	}
	
}
