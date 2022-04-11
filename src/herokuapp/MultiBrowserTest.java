package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    public static void main(String[] args) {
        String browser = "Edge";//"Chrome" //"Firefox"
        String baseurl = "http://the-internet.herokuapp.com/login";
        if(browser.equalsIgnoreCase("Edge"))
        {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            WebDriver driver = new EdgeDriver();

            driver.get(baseurl);//Launch the URL
            driver.manage().window().maximize();//Maximize window
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//We give Implicit time to driver

            String title = driver.getTitle();//Get the title of the page
            System.out.println("Page title = " + title);
            System.out.println("Current URL = " + driver.getCurrentUrl());//Get Current URL

            String p = driver.getPageSource();//Get the page-source
            System.out.println("Page-Source=" + p);

            WebElement usernameField = driver.findElement(By.id("username"));//Find the username field element
            usernameField.sendKeys("tomsmith");

            WebElement passwordField = driver.findElement(By.name("password"));//Find the password field element
            passwordField.sendKeys("SuperSecretPassword!");


            driver.close();//Close the browser
        } else if(browser.equalsIgnoreCase("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get(baseurl);//Launch the URL
            driver.manage().window().maximize();//Maximize window
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//We give Implicit time to driver

            String title = driver.getTitle();//Get the title of the page
            System.out.println("Page title = " + title);
            System.out.println("Current URL = " + driver.getCurrentUrl());//Get Current URL

            String p = driver.getPageSource();//Get the page-source
            System.out.println("Page-Source=" + p);

            WebElement usernameField = driver.findElement(By.id("username"));//Find the username field element
            usernameField.sendKeys("tomsmith");

            WebElement passwordField = driver.findElement(By.name("password"));//Find the password field element
            passwordField.sendKeys("SuperSecretPassword!");


            driver.close();//Close the browser
        }else if(browser.equalsIgnoreCase("Firefox"))
        {
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            WebDriver driver = new FirefoxDriver();

            driver.get(baseurl);//Launch the URL
            driver.manage().window().maximize();//Maximize window
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));//We give Implicit time to driver

            String title = driver.getTitle();//Get the title of the page
            System.out.println("Page title = " +title);
            System.out.println("Current URL = " +driver.getCurrentUrl());//Get Current URL

            String p = driver.getPageSource();//Get the page-source
            System.out.println("Page-Source=" + p);

            WebElement usernameField = driver.findElement(By.id("username"));//Find the username field element
            usernameField.sendKeys("tomsmith");

            WebElement passwordField = driver.findElement(By.name("password"));//Find the password field element
            passwordField.sendKeys("SuperSecretPassword!");


            driver.close();//Close the browser
        }else
        {
            System.out.println("Driver does not match");
        }
    }
}
