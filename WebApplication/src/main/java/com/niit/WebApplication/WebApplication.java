package com.niit.WebApplication;

import com.niit.WebApplication.Service.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WebApplication {

	public static void main(String[] args)
	{
		ApplicationContext applicationContext=SpringApplication.run(WebApplication.class, args);
		MessageService ms=applicationContext.getBean(MessageService.class);
		System.out.println(ms.getmessage());
	}

}
