package Homework7;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AudiTest extends AudiBase{
    AudiPage page;
@BeforeClass
    public void setUpPage(){
    page= new AudiPage(driver);
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

}
@Test
    public void testCase1(){
    driver.get("https://www.audiusa.com/");
    page.modelsButton.click();//click models button
    for (WebElement price:page.allPrices) {
        System.out.println(price.getText());//printed all prices
    }
    page.audiQ5.click();//chosen Audi Q5
    Assert.assertTrue(page.carYearAndModel.getText().contains("2020"));//validation of year
    Assert.assertTrue(page.carYearAndModel.getText().contains("Q5"));//validation of model
    page.buildButton.click();//click button Build
    String[]expectedClasses={"Premium","Premium Plus","Prestige"};
    String[]expectedPrices={"43,300","47,700","51,450"};
    for (WebElement w:page.ThreeCarInfo) {
        System.out.println(w.getText());
        System.out.println("======================");
    }
    for (int i= 0; i<page.ThreeCarInfo.size();i++) {//validated class types
        Assert.assertTrue(page.ThreeCarInfo.get(i).getText().contains(expectedClasses[i]));
    }
    for (int i= 0; i<page.ThreeCarInfo.size();i++) {//validated prices
        Assert.assertTrue(page.ThreeCarInfo.get(i).getText().contains(expectedPrices[i]));
    }
    for (WebElement w1:page.carVersion) {
        System.out.println(w1.getText());
        System.out.println("-------------------------------------");
    }
    String model1="45 TFSI®";
    String model2="45 TFSI® Titanium";
    String model3="55 TFSI® e Plug-in hybrid";
    for (WebElement version:page.carVersion) {// validated each version has 3 options
        Assert.assertTrue(version.getText().contains(model1));
        Assert.assertTrue(version.getText().contains(model2));
        Assert.assertTrue(version.getText().contains(model3));
    }


}
@Test
    public void test2() throws InterruptedException {
    driver.get("https://www.audiusa.com/models/audi-q5/2020/build.html?pr=default-q5-2020-FY");
    page.cookiesButton.click();
    Thread.sleep(3000);
    page.checkBox.click();
    page.continueButton.click();
    Assert.assertTrue(page.OptionalInfo.getText().contains("0"));
    System.out.println("ok Vova");
}

}
