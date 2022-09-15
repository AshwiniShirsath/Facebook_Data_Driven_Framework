package com.fb.qa.testcase;

import com.fb.qa.page.SignUpPage;
import com.fb.qa.testutil.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.util.concurrent.TimeUnit;

public class SignUpTest extends SignUpPage {
    Logger logger = Logger.getLogger(SignUpTest.class);

    public SignUpTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        setProperties();
        driver.get("https://www.facebook.com/reg/");
        logger.info("lunch browser");
    }


    // ----------------------------Data Driven Framework----------------

    @Test(dataProvider = "dataprovider1")
    public void SignUp(String firstName, String lastname) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/reg/");
        driver.findElement(By.name("firstname")).sendKeys(firstName);
        driver.findElement(By.name("lastname")).sendKeys(lastname);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.quit();
    }


    @Test(dataProvider = "dataprovider2")
    public void SignUp2(String reg_email__, String reg_email_confirmation__) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/reg/");
        driver.findElement(By.name("reg_email__")).sendKeys(reg_email__);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys(reg_email_confirmation__);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.quit();
    }

    @Test(dataProvider = "dataprovider3")
    public void SignUp3(
            String password_step_input, String birthday_day) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/reg/");
        driver.findElement(By.name("reg_passwd__")).sendKeys(password_step_input);
        driver.findElement(By.name("birthday_day")).sendKeys(birthday_day);
        driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.quit();
    }

    @Test(dataProvider = "dataprovider4")
    public void SignUp4(String birthday_month, String birthday_year) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/reg/");
        driver.findElement(By.name("birthday_month")).sendKeys(birthday_month);
        driver.findElement(By.name("birthday_year")).sendKeys(birthday_year);
        driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.quit();
    }

    @Test(priority = 1)
    public void verifyFirstNameOfSignUpPage() {
        logger.info("---------Start test run----------------------");
        String Name1 = verifyFirstNameField();
        Assert.assertEquals(Name1, "Ashwini");
        logger.info("----------------end log ---------------");
    }

    @Test(priority = 2)
    public void verifyLastNameOfSignUpPage() {
        logger.info("---------Start test run----------------------");
        String Name2 = verifyLastNameField();
        Assert.assertEquals(Name2, "Shirsath");
        logger.info("----------------end log ---------------");
    }

    @Test(priority = 3)
    public void verifyEmailFieldOfSignUpPage() {
        logger.info("---------Start test run----------------------");
        String email = verifyEmailTextField();
        Assert.assertEquals(email, "ashwinishirsath1221@gmail.com");
    }

    @Test(priority = 4)
    public void verifyConfirmEmailFieldOfSignUpPage() {
        logger.info("---------Start test run----------------------");
        String confEmail = verifyConfirmEmailTextField();
        Assert.assertEquals(confEmail, "ashwinishirsath1221@gmail.com");
        logger.info("----------------end log ---------------");
    }

    @Test(priority = 5)
    public void verifypassFieldOfSignUpPage() {
        logger.info("---------Start test run----------------------");
        String pass = verifyPasswordTextField();
        Assert.assertEquals(pass, "ashwini1221");
        logger.info("----------------end log ---------------");
    }

    @Test(priority = 6)
    public void verifyBirthDayFieldOfSignUpPage() {
        logger.info("---------Start test run----------------------");
        String birth_Day = verifyBirthDayField();
        Assert.assertEquals(birth_Day, "12");
        logger.info("----------------end log ---------------");
    }

    @Test(priority = 7)
    public void verifyBirthMonthFieldOfSignUpPage() {
        logger.info("---------Start test run----------------------");
        String birth_Month = verifyBirthmonthField();
        Assert.assertEquals(birth_Month, "April");
        logger.info("----------------end log ---------------");
    }

    @Test(priority = 8)
    public void verifyBirthYearFieldOfSignUpPage() {
        logger.info("---------Start test run----------------------");
        String birth_Year = verifyBirthYearField();
        Assert.assertEquals(birth_Year, "1994");
        logger.info("----------------end log ---------------");
    }

    @Test(priority = 9)
    public void verifyGenderFieldOfSignUpPage() {
        logger.info("---------Start test run----------------------");
        String gender = verifyGenderField();
        Assert.assertEquals(gender, "1");
        logger.info("----------------end log ---------------");
    }

    @Test(priority = 10)
    public void verifySubmitbtnOfSignUpPage() {
        logger.info("---------Start test run----------------------");
        boolean subBtn = verifySignUpBtnField();
        Assert.assertTrue(subBtn);
        logger.info("----------------end log ---------------");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}