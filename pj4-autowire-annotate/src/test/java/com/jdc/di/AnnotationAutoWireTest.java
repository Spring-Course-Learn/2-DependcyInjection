package com.jdc.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class AnnotationAutoWireTest {
	@Test
	void demo()
	{
		try(var context= new AnnotationConfigApplicationContext("com.jdc.di"))
		{
		
			var bean = context.getBean(MyClient.class);
			bean.showMesage();
		}
	}
}
