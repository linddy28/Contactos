package controlAppium;

import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import session.Session;

import java.net.MalformedURLException;

public class Control {
    protected WebElement control;
    protected By locator;

    public Control(By locator){

        this.locator=locator;
    }
    protected void findControl() throws MalformedURLException {
        this.control= Session.getInstance().getDriver().findElement(this.locator);
    }
    public void click() throws MalformedURLException {
        this.findControl();
        this.control.click();
    }
    public String getText() throws  MalformedURLException{
        this.findControl();
        return this.control.getText();
    }
     public void swipe () throws MalformedURLException {
        Actions actions = new Actions(Session.getInstance().getDriver());
        TouchAction action = new TouchAction (Session.getInstance().getDriver());
    }

    public WebElement getControl() throws MalformedURLException {
        this.findControl();
        return control;
    }
}
