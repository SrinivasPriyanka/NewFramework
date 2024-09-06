package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class base {
    WebDriver driver;
    Properties prop;
 public void loadProperties() throws IOException {
     FileInputStream file = new FileInputStream("C:\\NewFramework\\new_framework\\src\\main\\java\\config\\config.properties");
     prop = new Properties();
     prop.load(file);

 }

 public void openSpecificBrowser(String browserName){
     if (browserName.equals("Chrome")||browserName.equals("chrome"))
          driver = new ChromeDriver();
     if (browserName.equals("Firefox")||browserName.equals("firefox"))
         driver = new FirefoxDriver();
     if (browserName.equals("Edge")||browserName.equals("edge"))
         driver = new EdgeDriver();


 }

 public void launchBrowser() throws IOException {
loadProperties();
String br = prop.getProperty("browser");
     System.out.println(br);
openSpecificBrowser(br);
driver.get("https://www.facebook.com/login.php/");
driver.manage().window().maximize();
 }

    public static void main(String[] args) throws IOException {
        base b = new base();
        b.launchBrowser();

    }
}
