import net.bytebuddy.build.Plugin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class Annotationclass {


    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Beforeclass");
    }
   @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Beforemethod");
    }
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("BeforeTest");
        WebDriver driver = new ChromeDriver();
        driver.get("https://portal.igbc.in/register");
        System.out.println(driver.getTitle());
        //Assert.assertEquals("Swaglabs", driver.getTitle(),"I am expecting Swaglabs as title but I found" +driver.getTitle());
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("AfterClass");
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("Aftertest");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("Aftermethod");
    }


   @Test(priority = 1)
    public void test1( )
    {
        System.out.println("1 ");
    }
    @Test(priority = 0)
    public void test2()
    {
        System.out.println("2");
    }
    @Test(priority = 2)




    @Parameters("Username")
    public void test3(String Username)
    {
        System.out.println("3 "+ Username);
    }
    @Test(priority = 3)



    public void test4()
    {
        System.out.println("4");
    }
}
