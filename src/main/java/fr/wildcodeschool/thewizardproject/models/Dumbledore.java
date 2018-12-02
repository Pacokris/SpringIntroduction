package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dumbledoreId")
public class Dumbledore implements WizardInterface {
	
	private ChangeDressInterface changeDress;

	@Autowired
    public Dumbledore (@Qualifier("purpleDressAdvice")ChangeDressInterface theChangeDress) {
        changeDress = theChangeDress;
    }
	
	@Override
	public String giveAdvice() {
		return "On peut trouver le bonheur même dans les moments les plus sombres... Il suffit de se souvenir, d'allumer la lumière.";
	}
	
	@Override
	public String displayChangeDress() {
        return this.changeDress.displayChangeDress();
    }
}
