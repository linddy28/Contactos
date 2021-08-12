package basicTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BasicAppium {
    private AppiumDriver driver;
    @BeforeEach
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("deviceName","HUAWEI P20 lite");
        capabilities.setCapability("platformVersion","9");
        capabilities.setCapability("appPackage"," com.simplemobiletools.contacts");
        capabilities.setCapability("appActivity",".activities.MainActivity");
        capabilities.setCapability("platformName","Android");

        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        //implicit wait
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  }
    @AfterEach
    public void cleanup() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();

    }

    @Test
    public void createContacts(){
        //CLick +
        //Click [login] Button in login modal
        //ACTION DONDE-control? DONDE ESTA ESE CONTROL?
        driver.findElement(By.id("com.simplemobiletools.contacts:id/fragment_fab")).click();
        //Set Name
        driver.findElement(By.id("com.simplemobiletools.contacts:id/contact_first_name")).sendKeys("Lindsay");
        //Set Last Name
        driver.findElement(By.id("com.simplemobiletools.contacts:id/contact_surname")).sendKeys("Montano");
        //Set Number
        driver.findElement(By.id("com.simplemobiletools.contacts:id/contact_number")).sendKeys("1234567");
        //Click Plus
        driver.findElement(By.id("com.simplemobiletools.contacts:id/contact_numbers_add_new")).click();
        //Set Second Number
        driver.findElement(By.id("com.simplemobiletools.contacts:id/contact_numbers_add_new")).sendKeys("7654321");
        //Set Email
        driver.findElement(By.id("com.simplemobiletools.contacts:id/contact_email")).sendKeys("linddymontta@gmail.com");
        //Set Address
        driver.findElement(By.id("com.simplemobiletools.contacts:id/contact_address")).sendKeys("Cochabamba");
        //Click Birthday
        driver.findElement(By.id("com.simplemobiletools.contacts:id/contact_event")).click();
        //Click Calendar Year
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.ScrollView/android.widget.ViewAnimator/android.widget.ListView/android.widget.TextView[3]")).click();
        //Click Accept
        driver.findElement(By.id("android:id/button1")).click();
        //Click Day Birthday
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"28 diciembre 1996\"]")).click();
        //Click Accept 2
        driver.findElement(By.id("android:id/button1")).click();
        //Click Save
        driver.findElement(By.id("com.simplemobiletools.contacts:id/save")).click();
        //Click Contact
        driver.findElement(By.id("com.simplemobiletools.contacts:id/fragment_placeholder")).click();
        //Verificacion
        String expectedResult="Lindsay";
        String actualResult= driver.findElement(By.id("com.simplemobiletools.contacts:id/contact_first_name")).getText();
        Assertions.assertEquals(expectedResult, actualResult,"Error no fue creado");


    }
}
