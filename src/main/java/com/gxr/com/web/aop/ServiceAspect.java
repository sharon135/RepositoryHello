package com.gxr.com.web.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
//@Aspect
public class ServiceAspect {
	public final static Logger log=LoggerFactory.getLogger(ServiceAspect.class);
//定义切点 通知
//	@Pointcut("execution(* com.gxr.com.service..*(..))")
	public void aspect(){
		
	}
	
	/*@Before("aspect()")
	public int before(JoinPoint joinPoint){
		if(log.isInfoEnabled()){
			System.out.println("before"+joinPoint);
		}
		System.out.println(joinPoint.toString());
		return 22;
	}*/
	/*@After("aspect()")
	public void after(JoinPoint joinPoint){
		if(log.isInfoEnabled()){
			System.out.println("after " + joinPoint);
		}
	}*/
	
	/*@Around("aspect()")
	public void around(JoinPoint joinPoint){
		long start=System.currentTimeMillis();
		try {
			((ProceedingJoinPoint) joinPoint).proceed();
			long end=System.currentTimeMillis();
			Object[] oargs=joinPoint.getArgs();
			for(Object o :oargs){
				System.out.println("args------:"+o);
			}
			if(log.isInfoEnabled()){
				System.out.println("around"+joinPoint+"\tUse time:"+(end-start)+"ms!");
			}
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			long end=System.currentTimeMillis();
			if(log.isInfoEnabled()){
				System.out.println("around"+joinPoint+"\tUse time:"+(end-start)+"ms!");
			}
		}
		
				
	}*/
	
	/*@AfterReturning("aspect()")
	public void afterReturn(JoinPoint joinPoint){
		if(log.isInfoEnabled()){
			System.out.println("afterReturn " + joinPoint);
		}
	}*/
	
	//配置抛出异常后通知,使用在方法aspect()上注册的切入点
		@AfterThrowing(pointcut="aspect()", throwing="ex")
		public void afterThrow(JoinPoint joinPoint, Exception ex){
			if(log.isInfoEnabled()){
				System.out.println("afterThrow " + joinPoint + "\t" + ex.getMessage());
			}
		}

}
