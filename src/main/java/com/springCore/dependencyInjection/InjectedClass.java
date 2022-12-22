package com.springCore.dependencyInjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class InjectedClass {

	private FirstClass firstClass;

	public InjectedClass(FirstClass firstClass) {
		this.firstClass = firstClass;
	}

	public FirstClass getFirstClass() {
		return firstClass;
	}

	public void setFirstClass(FirstClass firstClass) {
		this.firstClass = firstClass;
	}
}
