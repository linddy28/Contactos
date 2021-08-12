package activities;

import controlAppium.Button;
import controlAppium.Label;
import org.openqa.selenium.By;

public class Details {
    public Button deleteName = new Button(By.id("com.simplemobiletools.contacts:id/delete"));
    public Button sureDeleteName = new Button(By.id("android:id/button1"));
    public Button updateName = new Button(By.id("com.simplemobiletools.contacts:id/edit"));
    public Button throwback = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Navegar hacia arriba\"]"));

}
