package com.test.demo.app;


import com.test.demo.beans.Student;
import lombok.SneakyThrows;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;

@ComponentScan({"com.test.demo.controller", "com.test.demo.beans", "com.test.demo.dependencyinjectiontype", "com.test.demo.scopeofbean"})
@SpringBootApplication
public class AppApplication {

	public static void main(String[] args)  {
		ApplicationContext applicationContext = SpringApplication.run(AppApplication.class, args);

		Student sima1 = (Student) applicationContext.getBean("sima");
		Student sima2 = (Student) applicationContext.getBean("sima"); // to access bean by name
		System.out.println(sima1);
		System.out.println(sima2);

		System.out.println("is both sima same : " + (sima1 == sima2));


	}

	@Scope("prototype")
	@Primary
    @Bean
	public Student sima(){
		return  Student.builder().name("Sima").rollNo(1).build();
	}


	@Bean
	public Student unnisa(){
		return  Student.builder().name("Unnisa").rollNo(1).build();
	}

}
