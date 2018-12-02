package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface {
	
	private ServiceChangeDress myServiceChangeDress;
	
	public String giveAdvice() {
		return "On peut trouver le bonheur même dans les moments les plus sombres... Il suffit de se souvenir, d'allumer la lumière.";
	}

	public void serviceChangeDress(ServiceChangeDress theServiceChangeDress) {
        myServiceChangeDress = theServiceChangeDress;
    }
	
	public String changeDress() {
        return myServiceChangeDress.changeDress();
    }
}
