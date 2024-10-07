package com.jdc.di.circulardepend;

import org.springframework.stereotype.Component;

@Component
public class BeanC {
	private BeanA beanA;
	public BeanC(BeanA beanA)
	{
		super();
		this.beanA = beanA;
	}
	public void doSomething()
	{
		beanA.sayHello();
	}
	public void sayHello()
	{
		System.out.println("Hello From Bean C");
	}
	
}
