package controls;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class Button extends BaseControl {
	public 	Button(By findBy) {
		super(findBy);
		// TODO Auto-generated constructor stub
	}
	public String Text() {
		try {return this.Element().getText();}
		catch(NoSuchElementException e) {
			return null;
		}
	}
	 public void Click() {
		 this.Element().click();
	 }

}
