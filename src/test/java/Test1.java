

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test1 extends BaseTest {

@Test
public void workFlow() throws InterruptedException {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.open();
    loginPage.loginToApp(username, password);

    MainPage mainPage = new MainPage(driver);
    mainPage.selectFireFightersCourse();

    FireFightersCoursePage fireFightersCoursePage = new FireFightersCoursePage(driver);
    Thread.sleep(3000);
    fireFightersCoursePage.selectProctoringFor3Link();

    Thread.sleep(15000);
    driver.switchTo().frame(driver.findElement(By.id("tool_content")));

    bSecureCanvasProctoringFor3Page bSecureCanvasProctoringFor3PageObject = new bSecureCanvasProctoringFor3Page(driver);
    bSecureCanvasProctoringFor3PageObject.selectRescheduleButton();

//    SelectDateAndTimePage selectDateAndTimePage = new SelectDateAndTimePage(driver);
//    selectDateAndTimePage.selectTimeButton().selectNowButton().saveButton();
    }
}