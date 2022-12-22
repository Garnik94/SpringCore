package com.springCore.dependencyInjection;

import com.sun.tools.javac.Main;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;

@Component
public class FirstClass implements MainInterface {

	@Value("${catalog.name}")
	public Integer catalogName;

	@Value("#{{'Thriller': 100, 'Comedy': 300}}")
	public Map<String, Integer> integerMap;

	private String stringProperty = "First Class";

	public String getStringProperty() {
		return stringProperty;
	}

	public void setStringProperty(String stringProperty) {
		this.stringProperty = stringProperty;
	}

	@PostConstruct
	public void init() {
		System.out.println("Init");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}

}
