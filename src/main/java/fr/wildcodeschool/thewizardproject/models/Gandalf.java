package fr.wildcodeschool.thewizardproject.models;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("gandalfId")
public class Gandalf implements WizardInterface {
	
	private ChangeDressInterface changeDress;

	@Autowired
    public Gandalf (@Qualifier("yellowDressAdvice")ChangeDressInterface theChangeDress) {
        changeDress = theChangeDress;
    }
	
	@Override
	public String giveAdvice() {
		return "Fuyez, Pauvres Fous !";
	}

	@Override
	public String displayChangeDress() {
        return this.changeDress.displayChangeDress();
    }
}
