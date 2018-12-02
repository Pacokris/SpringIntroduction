package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component
public class YellowDressAdvice implements ChangeDressInterface {

	@Override
	public String displayChangeDress() {
	    return "The wizard's dress is yellow!";
	}    
}
