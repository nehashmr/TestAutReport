package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {



    public WebDriver driverPage;


  public HomePage(WebDriver driver)
  {
      this.driverPage = driver;
      PageFactory.initElements(driver,this);


  }

    @FindBy(xpath = "")
    public WebElement menuOption;

    @FindBy(xpath="")
    public WebElement subMenuOption;



    public void mouseOverMenu()

    {

Actions actions = new Actions(driverPage);
actions.moveToElement(menuOption).build().perform();


    }


public void clickSubMenuOption()


{

    subMenuOption.click();



}




}
