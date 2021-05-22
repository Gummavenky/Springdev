package com.techi.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.techi.model.Car;
@Configuration
public class Appconfig {
	public Appconfig() {
		System.out.println("App config construcctions");
	}
	 @Bean
	 public Car getCar()
		{
			Car c=new Car();
			return c;
		}
		

}
