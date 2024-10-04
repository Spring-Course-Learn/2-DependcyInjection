package com.jdc.di.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class MyClient {
		@Autowired
		private MyService myService;
		public void showMessage()
		{
			System.out.println(myService.getMessage());
		}
}
