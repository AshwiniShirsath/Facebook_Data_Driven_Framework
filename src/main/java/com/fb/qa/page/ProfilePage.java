package com.fb.qa.page;
import com.fb.qa.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProfilePage extends BaseClass {
	public static WebElement posts;
    public static WebElement about;
    public static WebElement more;
    public static WebElement friends;
    public static WebElement photos;
    public static WebElement videos;
    public static WebElement check_In;
    public static WebElement addBio;
    public static WebElement editDetails;
    public static WebElement addHobbies;



    public String verifyPostsField() {
        posts = driver.findElement(By.xpath("\"//span[@class=gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y d1w2l3lo'][normalize-space()='Posts']\");\r\n"));
        return posts.getAttribute("class");
    }
    public String verifyAboutField() {
        about = driver.findElement(By.xpath("//span[normalize-space()='About']"));
        return about.getAttribute("class");
    }
    public String verifyMoreField() {
        more = driver.findElement(By.xpath("//span[normalize-space()='More']"));
        return more.getAttribute("class");
    }
    public String verifyFriendsField() {
        friends = driver.findElement(By.xpath("//span[normalize-space()='Friends']"));
        return friends.getAttribute("class");
    }
    public String verifyPhotosField() {
        photos = driver.findElement(By.xpath("//span[contains(text(),'Photos')]"));
        return photos.getAttribute("class");
    }
    public String verifyVideosField() {
        videos = driver.findElement(By.xpath("//span[contains(text(),'Videos')]"));
        return videos.getAttribute("class");
    }
    public String verifyCheck_InField() {
        check_In = driver.findElement(By.xpath("//span[normalize-space()='Check-ins']"));
        return check_In.getAttribute("class");
    }
    public String verifyAddBioField() {
        addBio = driver.findElement(By.xpath("//div[@aria-label='Add Bio']//div[@class='i85zmo3j alzwoclg jcxyg2ei dkyav5mx mw5ieb4x is65gj9g']"));
        return addBio.getAttribute("class");
    }
    public String verifyEditDetailsField() {
        editDetails = driver.findElement(By.xpath("//span[contains(text(),'Edit details')]"));
        return editDetails.getAttribute("class");
    }
    public String verifyAddHobbiesDetailsField() {
        addHobbies = driver.findElement(By.xpath("//div[@aria-label='Add Hobbies']//div[@class='om3e55n1 g4tp4svg alzwoclg jez8cy9q jcxyg2ei i85zmo3j sr926ui1 jl2a5g8c k7n6ui8p b41d885q hmqrhxox got7tec9 frfouenu bonavkto djs4p424 r7bn319e bdao358l aesu6q9g e4ay1f3w a5wdgl2o ed17d2qt']"));
        return addHobbies.getAttribute("class");
    }
}