package com.example.dummyLog;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@Primary
public class FirstDummy implements DummyLogger{

	@Override
	public void sayHello() {
		System.out.println("hello from first");
	}

}
