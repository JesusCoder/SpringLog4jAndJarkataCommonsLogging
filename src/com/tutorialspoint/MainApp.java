package com.tutorialspoint;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorialspoint.demoCommon.HelloWorld;

public class MainApp {

	static Logger log = Logger.getLogger(MainApp.class.getName());

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/tutorialspoint/Beans.xml");

		log.info("Going to create HelloWord Obj");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.setMessage("China is welcoming the world!");
		obj.getMessage();
		System.out.println("Program ended.");
		log.info("Exiting the program");
	}
}