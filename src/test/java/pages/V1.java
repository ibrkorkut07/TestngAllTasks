package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class V1 {

    public V1(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    
}
