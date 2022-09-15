package com.fb.qa.page;
import com.fb.qa.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SettingPage extends BaseClass {
	public static WebElement general;
    public static WebElement securityAndPrivacy;
    public static WebElement yourFacebookInfo;
    public static WebElement privacy;
    public static WebElement publicPosts;
    public static WebElement blocking;
    public static WebElement location;
    public static WebElement languageAndregion;
    public static WebElement stories;
    public static WebElement businessIntegration;


    public String verifyGeneralField(){
        general = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o')])[1]"));
        return general.getTagName();
    }
    public String verifySecurityAndPrivacyField(){
        securityAndPrivacy = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o')])[2]"));
        return securityAndPrivacy.getAttribute("class");
    }
    public String verifyYourFacebookInfoField(){
        yourFacebookInfo = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o')])[3]"));
        return yourFacebookInfo.getAttribute("class");
    }
    public String verifyPrivacyField(){
        privacy = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o')])[4]"));
        return privacy.getAttribute("class");
    }
    public String verifyPublicPostsField(){
        publicPosts = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o')])[6]"));
        return publicPosts.getAttribute("class");
    }
    public String verifyBlockingField(){
        blocking = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o')])[7]"));
        return blocking.getAttribute("class");
    }
    public String verifyLocationField(){
        location = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o')])[8]"));
        return location.getTagName();
    }
    public String verifyLanguageAndRegionField(){
        languageAndregion = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o')])[9]"));
        return languageAndregion.getAttribute("class");
    }
    public String verifyStoriesField(){
        stories = (WebElement) driver.findElements(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o')])[10]"));
        return stories.getAttribute("class");
    }
    public String verifyBusinessIntegrationField(){
        businessIntegration = driver.findElement(By.xpath("(//span[contains(@class,'gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 szxhu1pg hpj0pwwo sggt6rq5 tpi2lg9u pbevjfx6 ztn2w49o')])[16]"));
        return businessIntegration.getAttribute("class");
    }
}