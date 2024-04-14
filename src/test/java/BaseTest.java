import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected WebDriver driver;
    protected String username;
    protected String password;
    protected LoginPage loginPage;
    protected MainPage mainPage;


////////////////////////////////////////////////////////////////////////////////////////////

    //for work computer

//    @BeforeSuite
//    public void beforeSuite() {
//        System.setProperty("webdriver.chrome.driver", "C:/Users/alexander.anderson/IdeaProjects/bSecureCanvas/chromedriver.exe");
//    }

    // for home computer

    @BeforeSuite
    public void beforeSuite() {
        System.setProperty("webdriver.chrome.driver", "/Users/oleksii_kolesnik/IdeaProjects/bSecureCanvas/chromedriver");
    }

//////////////////////////////////////////////////////////////////////////////////////////////

    @BeforeMethod
    public void startUp() {

/////////////////////////////////////////////////////////////////////////////////////////

//        SafariDriver

//                // Initialize SafariDriver
//                driver = new SafariDriver();

//////////////////////////////////////////////////////////////////////////////////////////

//        // Set Chrome options to disable notifications
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-notifications");

///////////////////////////////////////////////////////////////////////////////////////////

//                                             //// ChromeDriver
//
//        // Pass the options when initializing ChromeDriver
//        driver = new ChromeDriver();


// Configure Chrome options to use fake device for media stream and fake video capture
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--use-fake-device-for-media-stream");
        options.addArguments("--use-file-for-fake-video-capture=/Users/oleksii_kolesnik/Movies/test ExamD.mp4");

        // Pass Chrome options when creating WebDriver instance
        driver = new ChromeDriver(options);


///////////////////////////////////////////////////////////////////////////////////////////

        // Maximize screen
        driver.manage().window().maximize();

///////////////////////////////////////////////////////////////////////////////////////////

        // Initialize the login page and navigate to it
        loginPage = new LoginPage(driver);


        // I keep this data for later
        username = "Satyen";
        password = "Password1";

//        // Perform login and get to the main page
//        mainPage = loginPage.loginToApp(username, password);

    }
//    @AfterMethod
//    public void tearDown() throws InterruptedException {
//        Thread.sleep(3000);
//        driver.quit();
//    }
}