import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
//    private WebElement getEmailField(){
//        By emailBy = By.xpath("//input[@name='pseudonym_session[unique_id]']");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(emailBy));
//        return driver.findElement(emailBy);
//    }

    private WebElement getEmailField(){
        return driver.findElement(By.xpath("(//input[@id='pseudonym_session_unique_id'])[1]"));
    }


    private WebElement getPasswordField(){
        return driver.findElement(By.xpath("//input[@type='password']"));
    }
    private WebElement getLoginButton() {
        return driver.findElement(By.xpath("//button[@type='submit']"));
    }

    public MainPage loginToApp(String username, String password){
        getEmailField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new MainPage(driver);
    }
    public void open() {
        driver.get("http://canvas.examd.org/");
    }
}