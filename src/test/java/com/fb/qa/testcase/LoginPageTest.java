package com.fb.qa.testcase;

import com.fb.qa.page.HomePage;
import com.fb.qa.page.LoginPage;
import com.fb.qa.testbase.TestBase;
import com.fb.qa.testutil.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.util.concurrent.TimeUnit;

public class LoginPageTest extends TestBase {
    Logger logger = Logger.getLogger(LoginPageTest.class);

    LoginPage loginPage;
    HomePage homePage;

    public LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        logger.info("lunch browser");
    }


    //----------------------------Data Driven Framework----------------

    @Test(dataProvider = "dataprovider1")
    public void login(String email, String password) throws InterruptedException {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.quit();
    }

    //Data Driven
    @DataProvider
    public Object[][] dataprovider1() {
        Object[][] data = new Object[3][2];
        data[0][0] = "ashwinishirsath1221@gmail.com";
        data[0][1] = "ashwini1221";

        data[1][0] = "sadanand0275@gmail.com";
        data[1][1] = "pandeyjee@0275";

        data[2][0] = "patangemohini5@gmail.com";
        data[2][1] = "Mohini@123";
        return data;
    }

    @Test(priority = 1)
    public void loginPageTitleTest() {
        logger.info("---------Start test run----------------------");
        String title = loginPage.validateLoginPageTitle();
        Assert.assertEquals(title, "Facebook – log in or sign up");
        logger.info("----------------end log ---------------");
    }

    @Test(priority = 2)
    public void fpmLogoImageTest() {
        logger.info("---------Start test run----------------------");
        boolean flag = loginPage.validateFPMImage();
        Assert.assertTrue(flag);
        logger.info("----------------end log ---------------");
    }

    @Test(priority = 3)
    public void EnterEmailTest() {
        logger.info("---------Start test run----------------------");
        loginPage.EnterEmail(prop.getProperty("email"));
        logger.info("----------------end log ---------------");
    }

    @Test(priority = 4)
    public void EnterPasswordTest() {
        logger.info("---------Start test run----------------------");
        loginPage.EnterPassword(prop.getProperty("password"));
        logger.info("----------------end log ---------------");
    }

    @Test(priority = 5)
    public void loginTest() {
        logger.info("---------Start test run----------------------");
        homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        logger.info("----------------end log ---------------");
    }

    @Test(priority = 6)
    public void validateFPMLoginBtnTest() {
        logger.info("---------Start test run----------------------");
        boolean flag = loginPage.validateFPMLoginBtn();
        Assert.assertTrue(flag);
        logger.info("----------------end log ---------------");
    }

    @Test(priority = 7)
    public void fpmSignUpBtnTest() {
        logger.info("---------Start test run----------------------");
        boolean flag = loginPage.validateFPMsignUpBtn();
        Assert.assertTrue(flag);
        logger.info("----------------end log ---------------");
    }

    @Test(priority = 8)
    public void fpmForgotPaswordTest() {
        logger.info("---------Start test run----------------------");
        boolean flag = loginPage.validateFPMforgotpassword();
        Assert.assertTrue(flag);
        logger.info("----------------end log ---------------");
    }

    @Test(priority = 9)
    public void fpmMLableTest() {
        logger.info("---------Start test run----------------------");
        boolean flag = loginPage.validateFPMLable();
        Assert.assertTrue(flag);
        logger.info("----------------end log ---------------");
    }

    @Test(priority = 10)
    public void fpmSecondSLableTest() {
        logger.info("---------Start test run----------------------");
        boolean flag = loginPage.validateFPMSecondSLable();
        Assert.assertTrue(flag);
        logger.info("----------------end log ---------------");
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}