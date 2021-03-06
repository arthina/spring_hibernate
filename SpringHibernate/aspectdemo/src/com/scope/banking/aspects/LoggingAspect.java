package com.scope.banking.aspects;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class LoggingAspect {
	private final static Logger logger = Logger.getLogger(LoggingAspect .class.getName()); 
	
	   public LoggingAspect() throws SecurityException, IOException
	   {
		   FileHandler fh = new FileHandler("C:/Software/MyLogFile.log");
			 logger.addHandler(fh);

	   }
		@Before("execution(* com.scope.banking.entities.Flight.getCapacity(..))")
		public void PersonlogBefore(JoinPoint joinPoint) {
             
			
			
			System.out.println("Person Name logBefore() is running!");
			System.out.println("hijacked : " + joinPoint.getSignature().getName());
			System.out.println("******");
			logger.info("Person Name logBefore() is running!");
			logger.info("hijacked : " + joinPoint.getSignature().getName());
			logger.info("******");
		}
		
		
		
		@After("execution(* com.scope.banking.entities.Flight.getCapacity(..))")
		public void logAfter(JoinPoint joinPoint) {

			System.out.println("Person get Name logAfter() is running!");
			System.out.println("hijacked : " + joinPoint.getSignature().getName());
			System.out.println("******");
			logger.info("Person get Name logAfter() is running!");
			logger.info("hijacked : " + joinPoint.getSignature().getName());
			logger.info("******");

		}
		
		@AfterThrowing( pointcut="execution(* com.scope.banking.entities.Flight.setCapacity(..))", throwing="exception")
		public void afterThrowing(JoinPoint joinPoint, Throwable exception) throws Throwable
		{ 
			logger.info("Inside CatchThrowException.afterThrowing() method...");
			logger.info("Running after throwing exception..."); 
			logger.info("Exception : " + exception); 
		} 
	
	
	
}
