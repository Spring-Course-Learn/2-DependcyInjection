package com.jdc.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jdc.di.bean.MyClient;
import com.jdc.di.bean.MyService;

@Configuration
public class ApplicationConfig {
		@Bean
		MyService myService()
		{
			return new MyService();
		}
		
		@Bean
		MyClient myClient()
		{
			return new MyClient();
		}

}
