package com.springCore;

import com.springCore.dependencyInjection.FirstClass;
import com.springCore.dependencyInjection.SecondClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@Configuration
@ComponentScan("com.springCore")
public class MainClass {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainClass.class);

//		SecondClass second = (SecondClass) context.getBean("secondClass");
//		FirstClass first = (FirstClass)(second.getFirstClass());
//		System.out.println(first.getStringProperty());

		SecondClass second = (SecondClass)applicationContext.getBean("secondClass");
		System.out.println(second.getFirstClass().getStringProperty());

		context.close();

	}

}
