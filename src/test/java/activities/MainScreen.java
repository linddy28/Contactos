package activities;

import controlAppium.Button;
import controlAppium.Label;
import controlAppium.LabelClick;
import controlAppium.TextBox;
import org.openqa.selenium.By;

public class MainScreen {


    public  Button addDeny = new Button(By.id("com.android.packageinstaller:id/permission_deny_button"));
    public Button addTaskButton=new Button(By.id("com.simplemobiletools.contacts:id/fragment_fab"));
    public Label nameTaskLabel=new Label(By.id("com.simplemobiletools.contacts:id/item_contact_name"));
    public Label nameTaskLabel1=new Label(By.xpath("//androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.TextView"));
    public LabelClick clickTaskLabelClick = new LabelClick(By.id("com.simplemobiletools.contacts:id/item_contact_name"));
    public Label search = new Label(By.id("com.simplemobiletools.contacts:id/search"));
    public TextBox writeName = new TextBox(By.id("com.simplemobiletools.contacts:id/search_src_text"));
    
    public MainScreen(){

    }
}
