package com.jdc.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdc.di.bean.MyClient;
import com.jdc.di.config.ApplicationConfig;

public class JavaBaseTest {
	@Test
	void demo()
	{
			try(var context = new AnnotationConfigApplicationContext(ApplicationConfig.class))
			{
				var clientBean = context.getBean(MyClient.class);
				clientBean.showMessage();
			}	
	}
}
