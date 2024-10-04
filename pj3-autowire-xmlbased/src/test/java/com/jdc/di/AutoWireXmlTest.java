package com.jdc.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AutoWireXmlTest {
	@Test
	void autoWireTest()
	{
		
		try(var context = new GenericXmlApplicationContext("classpath:/application.xml")){
			var bean = context.getBean(MyClient.class);
			bean.showMesage();
		}
	}
}
