package pages.realhome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RealHomePage extends BasePage {


    public RealHomePage(WebDriver driver) {
        super(driver);
    }

    By countRooms = By.xpath("//select[@id='rooms']");
    By option2rooms = By.xpath("//select[@id='rooms']/option[3]");
    By findBtn = By.xpath("//div[@id='residentialInputs']//a[text()='Найти']");

    public RealHomePage enterCountRoom(){
        driver.findElement(countRooms).click();
        driver.findElement(option2rooms).click();
        return this;
    }
    public RealHomePage clickToFind(){
        driver.findElement(findBtn).click();
        return this;
    }


}
