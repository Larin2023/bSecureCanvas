import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectDateAndTimePage extends BasePage {
    public SelectDateAndTimePage(WebDriver driver) {
        super(driver);
    }

    private WebElement getSeletTimeButton() {
        return driver.findElement(By.xpath("//input[@placeholder='Select time']"));
    }

    private WebElement getNowButton() {
        return driver.findElement(By.xpath("//li[@class='ant-picker-now']"));
    }

    private WebElement getSaveButton() {
        return driver.findElement(By.xpath("//span[normalize-space()='Save']"));
    }

    public BSecureCanvasProctoringFor3Page selectTime() throws InterruptedException {
        Thread.sleep(3000);
        getSeletTimeButton().click();
        Thread.sleep(3000);
        getNowButton().click();
        Thread.sleep(3000);
        getSaveButton().click();
        return new BSecureCanvasProctoringFor3Page(driver);
    }
//    private WebElement getSelectTimeButton() {
//        return driver.findElement(By.xpath("//input[@placeholder='Select time']"));
//    }
//    private WebElement getNowButton() {
//        return driver.findElement(By.xpath("//a[@class='ant-picker-now-btn']"));
//    }
//    private WebElement getSaveButton() {
//        return driver.findElement(By.xpath("//span[normalize-space()='Save']"));
//    }

//    public void selectTimeButton() {
//        getSelectTimeButton().click();
//    }
//    public void selectNowButton() {
//        getNowButton().click();
//    }
//    public bSecureCanvasProctoringFor3Page saveButton() {
//        getSaveButton().click();
//        return new bSecureCanvasProctoringFor3Page(driver);
//    }
}