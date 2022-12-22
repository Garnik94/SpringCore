package com.springCore.dependencyInjection;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("secondClass")
public class SecondClass implements MainInterface {

	@Resource
	private FirstClass firstClass;

	private String stringProperty = "First Class";

	public String getStringProperty() {
		return stringProperty;
	}

	public void setStringProperty(String stringProperty) {
		this.stringProperty = stringProperty;
	}

	public FirstClass getFirstClass() {
		return firstClass;
	}

	public void setFirstClass(FirstClass firstClass) {
		this.firstClass = firstClass;
	}
}
