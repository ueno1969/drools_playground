package com.sample.hello;

import org.drools.decisiontable.InputType;
import org.drools.decisiontable.SpreadsheetCompiler;
import org.kie.api.KieServices;
import org.kie.api.KieServices.Factory;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class HelloWorldDT {
	public HelloWorldDT() {
	}

	public static final void main(String[] args) {
		System.out.println("Start DT");

		try {
			KieServices t = Factory.get();
			KieContainer kContainer = t.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-dtables");

			// for debug
			//showCompilesRules("target/classes/dtables/hello_world.xls");

			Message message = new Message();
			message.setMessage("Hello World");
			message.setStatus(Message.HELLO);

			kSession.insert(message);
			kSession.fireAllRules();
//			kSession.execute( Arrays.asList( new Object[]{ message } ) );
		} catch (Throwable var5) {
			var5.printStackTrace();
		}

	}

	public static void showCompilesRules(String path) {

		InputStream is = null;
		try {
			is = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		SpreadsheetCompiler sc = new SpreadsheetCompiler();
		StringBuffer drl = new StringBuffer(sc.compile(is, InputType.XLS));
		System.out.println(drl);
}


}
