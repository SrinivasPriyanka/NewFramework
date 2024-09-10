package resource.staticResource;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Global_Static {

    public static WebDriver d;
    public static Properties prop;
    public static int testCase_ID;

    public static void testID(int ID){
        testCase_ID = ID;
    }
}
