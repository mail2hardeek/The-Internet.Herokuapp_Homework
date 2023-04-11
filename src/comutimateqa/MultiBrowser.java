package comutimateqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultiBrowser {

    static String browser = "Edge";

    static WebDriver driv;
    static String url = "https://courses.ultimateqa.com/users/sign_in";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driv = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driv = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Fire Fox")) {
            driv = new FirefoxDriver();
        } else if ((browser.equalsIgnoreCase("Internet Explorer"))) {
            driv = new InternetExplorerDriver();
        } else {

        }

    }
}
