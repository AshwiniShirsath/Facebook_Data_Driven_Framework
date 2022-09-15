package com.fb.qa.testcase;

import com.fb.qa.page.MenuPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenuPageTestCase extends MenuPage {

    public MenuPageTestCase() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        setProperties();
        driver.get("https://www.facebook.com/?sk=welcome");
        driver.findElement(By.name("email")).sendKeys("ashwinishirsath1221@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("ashwini1221");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.xpath("(//span[contains(@class,'b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken')])[2]")).click();
    }

    @Test(priority = 1)
    public void verifyFB_LogoForMenuPage() {
        boolean logoOfFb = verifyFacebookLogo();
        Assert.assertTrue(logoOfFb);
    }

    @Test(priority = 2)
    public void verifyWelcomeFieldLogoInMenuPage() {
        String welcomeField = verifyWelcomeField();
        Assert.assertEquals(welcomeField, "gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o");
    }

    @Test(priority = 3)
    public void verifyEventFieldForMenuPage() {
        String eventField = verifyEventField();
        Assert.assertEquals(eventField, "gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o");
    }

    @Test(priority = 4)
    public void verifyFindFriendsFieldOfMenuPage() {
        String FindFriendField = verifyFindFriendsField();
        Assert.assertEquals(FindFriendField, "gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o");
    }

    @Test(priority = 5)
    public void verifyGroupsFieldOfPage() {
        String groups = verifyGroupsField();
        Assert.assertEquals(groups, "gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o");
    }

    @Test(priority = 6)
    public void verifyNewsFieldOfPage() {
        String newsField = verifyNewsField();
        Assert.assertEquals(newsField, "gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o");
    }

    @Test(priority = 7)
    public void verifyFavouritesFieldOfPage() {
        String favouritesField = verifyFavouritesField();
        Assert.assertEquals(favouritesField, "gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o");
    }

    @Test(priority = 8)
    public void verifyWatchVideosFieldOfPage() {
        String watchVideosField = verifyWatchVideosField();
        Assert.assertEquals(watchVideosField, "gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o");
    }

    @Test(priority = 9)
    public void verifyGamingFieldOfMenuPage() {
        String gamingField = verifyGamingField();
        Assert.assertEquals(gamingField, "gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o");
    }

    @Test(priority = 10)
    public void verifyBloodDonationFieldOfMenuPage() {
        String bloodDonationField = verifyBloodDonationField();
        Assert.assertEquals(bloodDonationField, "gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o");
    }

    @AfterTest
    public void closeBrowsers() {
        driver.quit();
    }
}