package activities;

import controlAppium.Button;
import controlAppium.Control;
import controlAppium.LabelClick;
import org.openqa.selenium.By;

public class ScreenCalendar {

    public LabelClick yearClick = new LabelClick(By.id("android:id/date_picker_header_year"));
    //public Button numberYearClick = new Button(By.xpath("//android.widget.ScrollView/android.widget.ViewAnimator/android.widget.ListView/android.widget.TextView[4]"));
    public LabelClick numberClick = new LabelClick(By.xpath("//android.view.View[@content-desc=\"09 agosto 2021\"]"));
    public Button clickSaveBirthday = new Button(By.id("android:id/button1"));

    public ScreenCalendar(){

    }
}
