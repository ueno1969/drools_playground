package com.sample.hello;

import org.kie.api.KieServices;
import org.kie.api.KieServices.Factory;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class HelloWorld {
	public HelloWorld() {
	}

	public static final void main(String[] args) {
		try {
			KieServices t = Factory.get();
			KieContainer kContainer = t.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rules");

			Message message = new Message();
			message.setMessage("Hello World");
			message.setStatus(Message.HELLO);
			kSession.insert(message);
			kSession.fireAllRules();
		} catch (Throwable var5) {
			var5.printStackTrace();
		}

	}
}
