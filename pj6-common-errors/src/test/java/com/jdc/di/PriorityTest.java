package com.jdc.di;


import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdc.di.pirority.MyClientPriority;
import com.jdc.di.config.ApplicationConfig;

public class PriorityTest {
	@Test
	void demo()
	{
		try(var context = new AnnotationConfigApplicationContext(ApplicationConfig.class) )
		{
				var client = context.getBean(MyClientPriority.class);
				client.showMessage();
		}
	}
}
