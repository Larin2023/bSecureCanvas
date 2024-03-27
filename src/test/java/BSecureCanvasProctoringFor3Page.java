import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BSecureCanvasProctoringFor3Page extends BasePage {
    public BSecureCanvasProctoringFor3Page(WebDriver driver) {
        super(driver);
    }

    private WebElement getRescheduleButton() {
        return driver.findElement(By.xpath("//p[@class='font-semibold']"));
    }
    public SelectDateAndTimePage selectRescheduleButton() {
        getRescheduleButton().click();
        return new SelectDateAndTimePage(driver);
    }

    private WebElement getAuthenticationForProctoringButton() {
        return driver.findElement(By.xpath("//p[normalize-space()='Authentication for Proctoring']"));
    }
    public ProctoringFor3AuthenticationSystemCheckPage selectAuthenticationForProctoringButton() {
        getAuthenticationForProctoringButton().click();
        return new ProctoringFor3AuthenticationSystemCheckPage(driver);
    }
}