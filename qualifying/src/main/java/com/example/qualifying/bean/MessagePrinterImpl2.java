package com.example.qualifying.bean;

import org.springframework.stereotype.Component;

@Component("impl2")
public class MessagePrinterImpl2 implements MessagePrinter {

	@Override
	public void showMessage() {
		System.out.println("MessagePrinterImpl2");
	}

	@Override
	public String toString() {
		return "MessagePrinterImpl2";
	}

}
