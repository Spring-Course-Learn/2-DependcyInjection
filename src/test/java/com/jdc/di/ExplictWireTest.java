package com.jdc.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExplictWireTest {
	@org.junit.jupiter.api.Test
	public void Test()
	{
			try(var context= new ClassPathXmlApplicationContext("classpath:/application.xml"))
			{
				var client1 = context.getBean("client1",MyClient.class);
				client1.showMessage();
				
				var client2 = context.getBean("client2",MyClient.class);
				client2.showMessage();
			}
	}

}
