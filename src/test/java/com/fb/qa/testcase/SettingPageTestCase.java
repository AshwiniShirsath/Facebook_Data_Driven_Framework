package com.fb.qa.testcase;

import com.fb.qa.page.SettingPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SettingPageTestCase extends SettingPage {
    public SettingPageTestCase(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        setProperties();
        driver.get("https://www.facebook.com/?sk=welcome");
        driver.findElement(By.name("email")).sendKeys("ashwinishirsath1221@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("a+shwini1221");
        driver.findElement(By.xpath("")).sendKeys("settings");
        driver.findElement(By.xpath("//div[@role='button']//div[@class='aglvbi8b om3e55n1 i8zpp7h3 g4tp4svg']//*[name()='svg']//*[name()='g' and contains(@mask,'url(#jsc_c')]//*[name()='image' and contains(@x,'0')]")).click();
        driver.findElement(By.name("//span[normalize-space()='Settings & privacy']")).click();
    }

    @Test(priority = 1)
    public void verifyGeneralFieldOfPage(){
        String generalField = verifyGeneralField();
        Assert.assertEquals(generalField,"span");
    }
    @Test(priority = 2)
    public void verifySecurityAndPrivacyFieldOfPage(){
        String securityAndPrivacyField = verifySecurityAndPrivacyField();
        Assert.assertEquals(securityAndPrivacyField,"gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o");
    }
    @Test(priority = 3)
    public void verifyFacebookInfoOfPage(){
        String facebookInfoField = verifyYourFacebookInfoField();
        Assert.assertEquals(facebookInfoField,"gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o");
    }
    @Test(priority = 4)
    public void verifyPrivacyFieldOfPage(){
        String privacyField = verifyPrivacyField();
        Assert.assertEquals(privacyField,"gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o");
    }
    @Test(priority = 5)
    public void verifyPublicPostsOfPage(){
        String publicPostsField = verifyPublicPostsField();
        Assert.assertEquals(publicPostsField,"gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o");
    }
    @Test(priority = 6)
    public void verifyBlockingFieldOfPage(){
        String blockingField = verifyBlockingField();
        Assert.assertEquals(blockingField,"gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o");
    }
    @Test(priority = 7)
    public void verifyLocationFieldOfPage(){
        String locationOfField = verifyLocationField();
        Assert.assertEquals(locationOfField,"span");
    }
    @Test(priority = 8)
    public void verifyLanguageAndRegionFieldOfSignUpPage(){
        String languageAndRegion = verifyLanguageAndRegionField();
        Assert.assertEquals(languageAndRegion,"gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o");
    }
    @Test(priority = 9)
    public void verifyStoriesofPage(){
        String storiesField = verifyStoriesField();
        Assert.assertEquals(storiesField,"gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o");
    }
    @Test(priority = 10)
    public void verifyBusinessIntegrationFieldOfPage(){
        String businessIntegrationField = verifyBusinessIntegrationField();
        Assert.assertEquals(businessIntegrationField,"gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o");
    }
    @AfterTest
    public void closeBrowsers(){
        driver.quit();
    }
}