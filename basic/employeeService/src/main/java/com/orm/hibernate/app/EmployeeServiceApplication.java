package com.orm.hibernate.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.orm.hibernate")
@SpringBootApplication // (@ComponentScan + @EnableAutoConfigure + @Configurarion  )
public class EmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}


/*	@Bean
	public ViewResolver viewResolver(){
		InternalResourceViewResolver resourceViewResolver = new InternalResourceViewResolver();
		resourceViewResolver.setPrefix("/WEB-INF/jsp/");
		resourceViewResolver.setSuffix(".jsp");
		return resourceViewResolver;
	}*/


}
