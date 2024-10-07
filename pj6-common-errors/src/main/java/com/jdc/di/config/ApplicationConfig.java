package com.jdc.di.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jdc.di.bean.MyClient;
import com.jdc.di.bean.MyService;

@ComponentScan("com.jdc.di.pirority")//For priority Bean Jarkata
@Configuration
public class ApplicationConfig {
	@Bean
	MyClient myClient()
	{
		return new MyClient();
	}
	//@Bean(autowireCandidate = false)
	@Bean
	@Qualifier("s1")
	MyService service1()
	{
		return new MyService();
	}
	
	//@Bean(autowireCandidate = false)
	@Bean
	@Qualifier("s2")
	MyService service2()
	{
		return new MyService();
	}
	
	@Bean
	@Qualifier("s3")
	MyService service3()
	{
		return new MyService();
	}

}
