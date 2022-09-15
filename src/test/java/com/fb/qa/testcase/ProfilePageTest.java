package com.fb.qa.testcase;
import com.fb.qa.page.ProfilePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfilePageTest extends ProfilePage {
    public ProfilePageTest(){
        super();
    }
    
    @BeforeMethod
    public void setUp(){
        setProperties();
        driver.get("https://www.facebook.com/?sk=welcome");
        driver.findElement(By.name("email")).sendKeys("ashwinishirsath1221@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("ashwini1221");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.xpath("//div[@class='alzwoclg cqf1kptm tpvapw4o th51lws0 mfn553m3 om3e55n1 gb2oqlaf n853dmmh no4pw96u aiqapapm af4bhcrp bx95oyie']//div[@class='aglvbi8b om3e55n1 i8zpp7h3 g4tp4svg']//*[name()='svg']//*[name()='g' and contains(@mask,'url(#jsc_c')]//*[name()='image' and contains(@x,'0')]")).click();
    }
    
    @Test(priority = 1)
    public void verifyPostsFieldForProfilePage(){
        String postField = verifyPostsField();
        Assert.assertEquals(postField, "gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y d1w2l3lo");
    }
    @Test(priority = 2)
    public void verifyAboutFieldLogoInProfilePage(){
        String aboutField  = verifyAboutField();
        Assert.assertEquals(aboutField,"i85zmo3j bdao358l alzwoclg jez8cy9q p4zypb3t om3e55n1 a26p89d5 r227ecj6 gt60zsk1\"");
    }
    @Test(priority = 3)
    public void verifyMoreFieldForProfilePage(){
        String moreField = verifyMoreField();
        Assert.assertEquals(moreField,"gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y rtxb060y");
    }
    @Test(priority = 4)
    public void verifyFriendsFieldOfProfilePage(){
        String friendField = verifyFriendsField();
        Assert.assertEquals(friendField,"gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y rtxb060y\"");
    }
    @Test(priority = 5)
    public void verifyPhotosFieldOfPage(){
        String photosField = verifyPhotosField();
        Assert.assertEquals(photosField,"i85zmo3j bdao358l alzwoclg jez8cy9q p4zypb3t om3e55n1 a26p89d5 r227ecj6 gt60zsk1");
    }
    @Test(priority = 6)
    public void verifyvideosFieldOfPage(){
        String videosField = verifyVideosField();
        Assert.assertEquals(videosField,"i85zmo3j bdao358l alzwoclg jez8cy9q p4zypb3t om3e55n1 a26p89d5 r227ecj6 gt60zsk1");
    }
    @Test(priority = 7)
    public void verifyCheck_InFieldOfPage(){
        String checkInField = verifyCheck_InField();
        Assert.assertEquals(checkInField,"i85zmo3j bdao358l alzwoclg jez8cy9q p4zypb3t om3e55n1 a26p89d5 r227ecj6 gt60zsk1");
    }
    @Test(priority = 8)
    public void verifyAddBioFieldOfPage(){
        String addBioField = verifyAddBioField();
        Assert.assertEquals(addBioField,"om3e55n1 g4tp4svg alzwoclg jez8cy9q jcxyg2ei i85zmo3j sr926ui1 jl2a5g8c k7n6ui8p b41d885q hmqrhxox got7tec9 frfouenu bonavkto djs4p424 r7bn319e bdao358l aesu6q9g e4ay1f3w a5wdgl2o ed17d2qt");
    }
    @Test(priority = 9)
    public void verifyEditDetailsFieldOfProfilePage(){
        String editDetailsOfField = verifyEditDetailsField();
        Assert.assertEquals(editDetailsOfField,"om3e55n1 g4tp4svg alzwoclg jez8cy9q jcxyg2ei i85zmo3j sr926ui1 jl2a5g8c k7n6ui8p b41d885q hmqrhxox got7tec9 frfouenu bonavkto djs4p424 r7bn319e bdao358l aesu6q9g e4ay1f3w a5wdgl2o ed17d2qt");
    }
    @Test(priority = 10)
    public void verifyAddHobbiesFieldOfHomePage(){
        String addHobbiesField = verifyAddHobbiesDetailsField();
        Assert.assertEquals(addHobbiesField,"om3e55n1 g4tp4svg alzwoclg jez8cy9q jcxyg2ei i85zmo3j sr926ui1 jl2a5g8c k7n6ui8p b41d885q hmqrhxox got7tec9 frfouenu bonavkto djs4p424 r7bn319e bdao358l aesu6q9g e4ay1f3w a5wdgl2o ed17d2qt");
    }
   	
    
    @AfterTest
    public void closeBrowsers(){
          driver.quit();
    }
}