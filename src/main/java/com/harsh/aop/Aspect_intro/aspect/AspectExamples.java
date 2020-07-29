package com.harsh.aop.Aspect_intro.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class AspectExamples {
	
	@Before("execution(* com.harsh.aop.Aspect_intro.business.*.*(..))")
	public void beforeExample()
	{
		System.out.println("Interecpted Call before Anything ");
	}
	
	@Before("com.harsh.aop.Aspect_intro.aspect.CommonJoinPointConfig.businessLayer()") //Reading Join Points from Common FIle
	public void beforeJoinPointsExample(JoinPoint joinpoint) 
	{
		System.out.println("JoinPoint Example " +joinpoint ); //Target method which is being invoked
	}
	
	
	@AfterReturning(value = "execution(* com.harsh.aop.Aspect_intro.business.*.*(..))", returning = "result")
	public void afterReturningExample(JoinPoint joinpoint, Object result) 
	{
		System.out.println("AfterReturning Example  " +result ); //Returing value will be mapped to Result variable
	}
	
	@Around(value = "execution(* com.harsh.aop.Aspect_intro.business.*.*(..))")
	public void afterReturningExample(ProceedingJoinPoint joinpoint) throws Throwable 
	{
		long start = System.currentTimeMillis();
		System.out.println("Around before Execution");
		joinpoint.proceed();
		long end = System.currentTimeMillis();
		System.out.println("Around after Execution");
		System.out.println("Time Taken " + (end-start));
	}
	
	
	@Before("com.harsh.aop.Aspect_intro.aspect.CommonJoinPointConfig.customAnnotation()")
	public void customAnnotationExample() 
	{
		System.out.println("custom Annotation Example "  ); //Custom annotation Tracking
	}

}
