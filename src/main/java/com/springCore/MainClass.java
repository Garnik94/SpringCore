package com.springCore;

import com.springCore.dependencyInjection.FirstClass;
import com.springCore.dependencyInjection.SecondClass;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//		SecondClass second = (SecondClass) context.getBean("secondClass");
//		FirstClass first = (FirstClass)(second.getFirstClass());
//		System.out.println(first.getStringProperty());

		SecondClass second = (SecondClass)context.getBean("secondClass");
		System.out.println(second.getFirstClass().getStringProperty());

		context.close();

	}

}
