package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface {
	
	private ServiceChangeDress serviceChangeDress;
	
	public Gandalf(ServiceChangeDress theServiceChangeDress) {
		serviceChangeDress = theServiceChangeDress;
	}
	
	@Override
	public String giveAdvice() {
		return "Fuyez, Pauvres Fous !";
	}

	@Override
	public String changeDress() {
		return this.serviceChangeDress.changeDress();
	}
}
