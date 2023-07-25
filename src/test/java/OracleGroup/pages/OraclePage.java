package OracleGroup.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import OracleGroup.utilities.Driver;

public class OraclePage {
    public OraclePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='Username']")
    public WebElement gebruikersNaam;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='submit']")
    public WebElement inloggen;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement toegangscode;



}
