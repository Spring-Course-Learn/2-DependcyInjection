package com.jdc.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdc.di.bean.MyClient;

public class CircularDependencyTest {
	@Test
	void demo()
	{
		try(var context = new AnnotationConfigApplicationContext("com.jdc.di.circulardepend") )
		{
				System.out.println("Hello Wordl");
		}
	}
}
