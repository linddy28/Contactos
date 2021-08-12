package cleanTest;

import activities.Details;
import activities.MainScreen;
import activities.NewContact;
import activities.ScreenCalendar;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.net.MalformedURLException;

public class ContactTest {
    private MainScreen mainScreen = new MainScreen();
    private NewContact newContact = new NewContact();
    private ScreenCalendar screenCalendar = new ScreenCalendar();
    private Details details = new Details();


    @Test
    public void verifyCreateTask() throws MalformedURLException, InterruptedException {
        String name1 = "Lindsay Montano";
        String name2 = "Valeria Cartagena";
        String actName = "Ana";
        String updateName = "Ana Cartagena";


        mainScreen.addDeny.click();
        mainScreen.addTaskButton.click();

        newContact.firstName.setValue("Lindsay");
        newContact.surName.setValue("Montano");
        newContact.number.setValue("1234567");
        newContact.email.setValue("linddymontta@gmail.com");
        newContact.address.setValue("Cochabamba");
        newContact.clickBirthday.click();

        //screenCalendar.yearClick.click();
        //Session.getInstance().swipe();
        //screenCalendar.numberYearClick.click();

        screenCalendar.numberClick.click();
        screenCalendar.clickSaveBirthday.click();

        newContact.clickSaveContact.click();

        Assertions.assertEquals(mainScreen.nameTaskLabel.getText(), name1, "Task was created");

        mainScreen.addTaskButton.click();

        newContact.firstName.setValue("Valeria");
        newContact.surName.setValue("Cartagena");
        newContact.number.setValue("7654321");
        newContact.email.setValue("valecartagena@gmail");
        newContact.address.setValue("Cochabamba");
        newContact.clickBirthday.click();

        screenCalendar.numberClick.click();
        screenCalendar.clickSaveBirthday.click();

        newContact.clickSaveContact.click();

        //Assertions.assertEquals(mainScreen.nameTaskLabel1.getText(), name2, "Task was created");

        mainScreen.search.click();
        mainScreen.writeName.setValue("Lindsay");

        mainScreen.clickTaskLabelClick.click();
        details.deleteName.click();
        details.sureDeleteName.click();

        Assertions.assertEquals(mainScreen.nameTaskLabel1.getText(), name2, "Task was created");

        mainScreen.clickTaskLabelClick.click();
        details.updateName.click();
        newContact.firstName.setValue(actName);
        newContact.clickSaveContact.click();
        details.throwback.click();

        Assertions.assertEquals(mainScreen.nameTaskLabel1.getText(), updateName, "Task was created");



    }
    @AfterEach
    public void close() throws MalformedURLException{
        Session.getInstance().closeSession();

         }
    }
