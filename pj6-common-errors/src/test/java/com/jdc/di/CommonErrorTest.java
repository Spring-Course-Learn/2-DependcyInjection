package com.jdc.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdc.di.bean.MyClient;
import com.jdc.di.config.ApplicationConfig;

public class CommonErrorTest {
	@Test
	void demo()
	{
		try(var context = new AnnotationConfigApplicationContext(ApplicationConfig.class) )
		{
				var client = context.getBean(MyClient.class);
				client.showMessage();
		}
	}
}
