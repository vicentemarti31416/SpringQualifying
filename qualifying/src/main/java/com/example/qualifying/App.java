package com.example.qualifying;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.qualifying.bean.BeanGetter;

public class App {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		BeanGetter getter = context.getBean(BeanGetter.class);
		System.out.println(getter.getPrinter());
	}
}
