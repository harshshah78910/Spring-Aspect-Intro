package com.harsh.aop.Aspect_intro.data;

import org.springframework.stereotype.Repository;

import com.harsh.aop.Aspect_intro.aspect.TrackTime;

@Repository
public class Dao1 {

	@TrackTime
	public String retrieveFromDB()
	{
		return "Dao 1";
	}
	
}
