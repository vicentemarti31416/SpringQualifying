package com.example.qualifying.bean;

import org.springframework.stereotype.Component;

@Component("impl1")
public class MessagePrinterImpl1 implements MessagePrinter {

	@Override
	public void showMessage() {
		System.out.println("MessagePrinterImpl1");
	}

	@Override
	public String toString() {
		return "MessagePrinterImpl1";
	}

}
