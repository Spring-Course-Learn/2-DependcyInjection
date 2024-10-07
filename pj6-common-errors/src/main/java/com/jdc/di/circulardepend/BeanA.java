package com.jdc.di.circulardepend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
	@Autowired
	private BeanB beanB;
//	
//	public  BeanA(BeanB beanB)
//	{
//		super();
//		this.beanB = beanB;
//	}
	public void doSomething()
	{
		beanB.sayHello();
	}
	public void sayHello()
	{
		System.out.println("Hello From Bean A");
	}
}
