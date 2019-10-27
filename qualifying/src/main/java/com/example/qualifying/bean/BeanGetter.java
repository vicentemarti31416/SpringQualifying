package com.example.qualifying.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanGetter {

	@Autowired
	@Qualifier("impl1")
	private MessagePrinter printer;

	public MessagePrinter getPrinter() {
		return printer;
	}

}
