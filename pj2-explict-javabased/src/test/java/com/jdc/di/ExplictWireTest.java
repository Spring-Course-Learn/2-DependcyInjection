package com.jdc.di;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdc.config.ApplicationConfig;
public class ExplictWireTest {
		@Test
		void Test()
		{
			try(var context= new AnnotationConfigApplicationContext(ApplicationConfig.class))
			{
				var client1 = context.getBean("client1",MyClient.class);
				client1.showMessage();
				
				var client2 = context.getBean("client2",MyClient.class);
				client2.showMessage();
			}
		}
}
