package com.example.dummyLog;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class WithPrimaryCommandLiner implements CommandLineRunner{

	  private final DummyLogger dummyLogger;
	  
	  public WithPrimaryCommandLiner(@Qualifier("firstDummy") final DummyLogger dummyLogger) {
		  this.dummyLogger = dummyLogger;
	  }

	  @Override
	  public void run(final String... args) throws Exception {
	    dummyLogger.sayHello();
	  }

}
