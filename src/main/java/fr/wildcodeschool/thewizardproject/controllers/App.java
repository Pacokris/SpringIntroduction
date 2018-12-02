package fr.wildcodeschool.thewizardproject.controllers;

import fr.wildcodeschool.thewizardproject.models.WizardInterface;
import fr.wildcodeschool.thewizardproject.models.Dumbledore;
import fr.wildcodeschool.thewizardproject.models.Gandalf;
import fr.wildcodeschool.thewizardproject.models.ServiceChangeDress;

public class App {

	    public void start() {
	    	Dumbledore myWizard = new Dumbledore();
	        System.out.println("");
	        System.out.println("******************");
	        System.out.println(myWizard.giveAdvice());
	        System.out.println("******************");
	        ServiceChangeDress myServiceChangeDress = new ServiceChangeDress();
	        myWizard.serviceChangeDress(myServiceChangeDress);
	        System.out.println(myWizard.changeDress());
	    }
}