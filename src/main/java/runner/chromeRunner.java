package runner;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class chromeRunner {
    @BeforeTest

    public static void setUp(){
        Selenide.open("https://google.com/");
        Configuration.browserSize = "1920x1080";
    }

    @AfterTest
    public static void clearBrowser(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
    }
}
