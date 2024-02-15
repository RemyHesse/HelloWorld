package fr.afpa.pompey.cda22045.helloworld;

import org.springframework.stereotype.Component;

@Component
public class BusinessService {
	
	public HelloWorld getHelloWorld() {
		return new HelloWorld();
	}
	
}