package ensa.tpaop.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ensa.tpaop.model.Client;
import ensa.tpaop.model.Compte;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
		Client cl = (Client)applicationContext.getBean("client");
		cl.verser(100);
		cl.retirer(50);	   
	}

}
