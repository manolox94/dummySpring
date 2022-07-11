package com.example.dummyLog;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class WithSecondaryCommandLineRunner implements CommandLineRunner{

	  private final DummyLogger dummyLogger;

	  public WithSecondaryCommandLineRunner(@Qualifier("secondDummy") final DummyLogger dummyLogger) {
	    this.dummyLogger = dummyLogger;
	  }

	  @Override
	  public void run(final String... args) throws Exception {
	    dummyLogger.sayHello();
	  }
}
