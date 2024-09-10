package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import resource.staticResource.Global_Static;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {


 public void loadProperties() throws IOException {
     FileInputStream file = new FileInputStream("C:\\NewFramework\\new_framework\\src\\main\\java\\config\\config.properties");
     Global_Static.prop = new Properties();
     Global_Static.prop.load(file);

 }

 public void openSpecificBrowser(String browserName){
     if (browserName.equals("Chrome")||browserName.equals("chrome"))
          Global_Static.d = new ChromeDriver();
     if (browserName.equals("Firefox")||browserName.equals("firefox"))
         Global_Static.d = new FirefoxDriver();
     if (browserName.equals("Edge")||browserName.equals("edge"))
         Global_Static.d = new EdgeDriver();


 }

 public void launchBrowser() throws IOException {
loadProperties();
String br = Global_Static.prop.getProperty("browser");
     System.out.println(br);
openSpecificBrowser(br);
Global_Static.d .get("https://www.facebook.com/login.php/");
Global_Static.d.manage().window().maximize();
 }

    public static void main(String[] args) throws IOException {
        Base b = new Base();
        b.launchBrowser();

    }
}
