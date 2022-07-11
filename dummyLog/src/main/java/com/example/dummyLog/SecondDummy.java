package com.example.dummyLog;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class SecondDummy implements DummyLogger{

	@Override
	public void sayHello() {
		System.out.println("From Second DummyLogger");		
	}

}
