package com.springCore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springCore")
@PropertySource("classpath:application.properties")
public class AppConfig {

//	@Bean
//	public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
//		return new PropertySourcesPlaceholderConfigurer();
//	}

}
