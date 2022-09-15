package com.fb.qa.page;

import com.fb.qa.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class MenuPage extends BaseClass {
    public static WebElement fbLogo;
    public static WebElement welcome;
    public static WebElement event;
    public static WebElement FindFriends;
    public static WebElement groups;
    public static WebElement news;
    public static WebElement favourites;
    public static WebElement watchVideo;
    public static WebElement gaming;
    public static WebElement bloodDonation;


    public boolean verifyFacebookLogo() {
        fbLogo = driver.findElement(By.xpath("(//img[contains(@src,'https://static.xx.fbcdn.net/rsrc.php/v3/yl/r/GavNGH1v5-z.png')])[1]"));
        return fbLogo.isDisplayed();
    }

    public String verifyWelcomeField() {
        welcome = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o')])[1]"));
        return welcome.getAttribute("class");
    }

    public String verifyEventField() {
        event = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o')])[2]"));
        return event.getAttribute("class");
    }

    public String verifyFindFriendsField() {
        FindFriends = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o')])[3]"));
        return FindFriends.getAttribute("class");
    }

    public String verifyGroupsField() {
        groups = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o')])[4]"));
        return groups.getAttribute("class");
    }

    public String verifyNewsField() {
        news = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o')])[5]"));
        return news.getAttribute("class");
    }

    public String verifyFavouritesField() {
        favourites = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y rtxb060y')])[6]"));
        return favourites.getAttribute("class");
    }

    public String verifyWatchVideosField() {
        watchVideo = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o')])[9]"));
        return watchVideo.getAttribute("class");
    }

    public String verifyGamingField() {
        gaming = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o')])[10]"));
        return gaming.getAttribute("class");
    }

    public String verifyBloodDonationField() {
        bloodDonation = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w tpi2lg9u pbevjfx6 ztn2w49o')])[19]"));
        return bloodDonation.getAttribute("class");
    }
}