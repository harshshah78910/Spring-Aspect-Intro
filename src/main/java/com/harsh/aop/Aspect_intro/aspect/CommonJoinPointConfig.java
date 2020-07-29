package com.harsh.aop.Aspect_intro.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

	@Pointcut("execution(* com.harsh.aop.Aspect_intro.business.*.*(..))")
	public void businessLayer()
	{
		
	}
	
	@Pointcut("@annotation(com.harsh.aop.Aspect_intro.aspect.TrackTime)")
	public void customAnnotation()
	{
		
	}
	
}
