package fr.wildcodeschool.thewizardproject.controllers;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import fr.wildcodeschool.thewizardproject.models.*;

public class App {

	    public void start() {
	    	
	    	ServiceChangeDress serviceChangeDress = new ServiceChangeDress();
	    	
	    	Gandalf myWizard = new Gandalf(serviceChangeDress);
	        System.out.println("");
	    	System.out.println("******************");
	        System.out.println(myWizard.giveAdvice());
	        System.out.println("******************");
	        
	        System.out.println(myWizard.changeDress());
	    }
}