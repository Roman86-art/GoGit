package Homework7;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
public class AudiPage {
    public AudiPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li[@id='global-models']//a[contains(text(),'Models')]")
    public WebElement modelsButton;
    @FindBy(xpath = "//h5[contains(text(),'Starting at')]")
    public List<WebElement> allPrices;
    @FindBy(xpath = "//li[@class='modelslist__model suv electricHybrid top right']")
    public WebElement audiQ5;
    @FindBy(xpath = "//div[contains(@class,'content-overlay-parsys-overlay parsys')]" +
            "//div[contains(@class,'text parbase section')]" +
            "//div//h1//span[contains(@class,'text-white')]" +
            "//span[contains(@class,'text-white')]" +
            "//span[contains(@class,'extendedbold')][contains(text(),'2020 Audi Q5')]")
    public WebElement carYearAndModel;
    @FindBy(xpath = "//*[@id='content_overlay_9773301101']/div[2]/div/div/div[1]/div/p/b")
    public WebElement carPrice;
    @FindBy(xpath = "//a[@class='button no-icon center-text grey no-background fat']")
    public WebElement buildButton;
    @FindBy(xpath = "//div[@class='nm-module-trimline-engine-headline-wrapper']")
    public List <WebElement> ThreeCarInfo;
    @FindBy(className = "nm-module-trimline-engine-list")
    public List<WebElement> carVersion;
    @FindBy(xpath = "//div[@class='nm-module-trimline-engine-wrapper']//div[2]//li[@data-configurator-id='FYB5NY0WPS6W9_2020']//span[@class='audi-checkbox-symbol nm-module-trimline-engine-checkbox']")
    public WebElement checkBox;
    @FindBy(xpath = "//a[@class='nm-pageOpen audi-button audi-button--ghost']")
    public  WebElement continueButton;
    @FindBy(xpath = "//button[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button onetrust-lg close-icon']")
    public WebElement cookiesButton;
    @FindBy(xpath = "//div[contains(@class,'nm-basket-main-info')]//li[2]")
    public  WebElement OptionalInfo;
}

