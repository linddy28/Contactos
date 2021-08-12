package activities;

import controlAppium.Button;
import controlAppium.TextBox;
import org.openqa.selenium.By;

public class NewContact {

    public TextBox firstName= new TextBox(By.id("com.simplemobiletools.contacts:id/contact_first_name"));
    public TextBox surName = new TextBox(By.id("com.simplemobiletools.contacts:id/contact_surname"));
    public TextBox number = new TextBox(By.id("com.simplemobiletools.contacts:id/contact_number"));
    public TextBox email = new TextBox(By.id("com.simplemobiletools.contacts:id/contact_email"));
    public TextBox address = new TextBox(By.id("com.simplemobiletools.contacts:id/contact_address"));
    public Button clickBirthday = new Button(By.id("com.simplemobiletools.contacts:id/contact_event"));
    public Button clickSaveContact = new Button(By.id("com.simplemobiletools.contacts:id/save"));

    public NewContact(){

    }

}
