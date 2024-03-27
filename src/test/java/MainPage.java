import org.openqa.selenium.*;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    private WebElement getFireFightersCourseButton() {
//        By fireFightersCourseButtonBy = By.xpath("//div[@aria-label=\"Fire Fighter's Course\"]//a[@class='ic-DashboardCard__link']//span[1]");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(fireFightersCourseButtonBy));
//        return driver.findElement(fireFightersCourseButtonBy);
//    }

    private WebElement getFireFightersCourseButton(){
        return driver.findElement(By.xpath("(//span[normalize-space()=\"Fire Fighter's Course\"])[1]"));
    }
    public FireFightersCoursePage selectFireFightersCourse() {
        getFireFightersCourseButton().click();
        return new FireFightersCoursePage(driver);
    }
}