package com.jdc.di.circulardepend;

import org.springframework.stereotype.Component;

@Component
public class BeanB {
		private BeanC beanC;
		
		public BeanB(BeanC beanC)
		{
			super();
			this.beanC = beanC;
		}
		public void doSomething()
		{
			beanC.sayHello();
		}
		public void sayHello()
		{
			System.out.println("Hello From Bean B");
		}
}
