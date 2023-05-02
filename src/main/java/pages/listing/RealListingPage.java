package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RealListingPage extends BasePage {

    public RealListingPage(WebDriver driver) {
        super(driver);
    }
    private final By card = By.xpath("//div[@class='listing-item highlighted']");
    public RealListingPage checkCountCards(){
        waitElemntIsVisible(driver.findElement(card));

        int countCard = driver.findElement(card).getSize();
        Assert.asertEquals(countCard,20);
        return this;
    }
}
