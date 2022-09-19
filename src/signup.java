import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class signup{
    WebDriver driver;
    @BeforeMethod
    public void verify( )
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\gopinath.kk\\Downloads\\chromedriver_win32\\chromedriver.exe");
         driver = new ChromeDriver();
        
         driver.get("https://mobileworld.banyanpro.com/");
         driver.findElement(By.cssSelector("button[type='submit']")).click();
         driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
    }
    @Test(dataProvider = "datasets")
    public void testdata(String Fname,String Lname,String Email,String passwrd,String number,String date,String bio) throws InterruptedException
    {
    driver.findElement(By.cssSelector("#myName")).sendKeys(Fname);
 
    driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(Lname);
    driver.findElement(By.cssSelector("input[placeholder='Enter Email']")).sendKeys(Email);
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(passwrd);
    driver.findElement(By.cssSelector("input[placeholder='91XXXXXXXXXX']")).sendKeys(number);
   
    driver.findElement(By.xpath("//input[@type='date']")).sendKeys(date);
    driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys(bio);
    driver.findElement(By.xpath("//div[@class='col-md-2']//input[@name='gender']")).click();
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.switchTo().alert().accept();
    driver.quit();
}
    @DataProvider(name = "datasets")
    public Object[][] datasets(){
        Object[][] data = {{"gopinath","K K","gopinath@gmail.com","K K@123","1234567898","05/20/2022","qwertyuiopasdfghjkl"},
                           {"sa","sa","gopinath@gmail","sa","dfghggffd","05/20/2000",""},
                           {"rasdfghjkihugytrsdfgh","sfagsvgguiiiiiiiiiiopppppppppo","gopinath@gmail","Hajjegbb243626@#$%&HRRt","gopinathrlss@gmail.com","05/22/2000","1234567"},
                           {"gopinath","K K","gopinath@gmail.com","K K@123","123445566666","05/20/2022","hai"},
                           {"gopinath","K K","@gmail.com","K K@123","123445566666","05/20/2000","hai"},
                           {"gopinath","K K","gopinath@gmail.com","gk@","98342556177","05/20/2000","hai"},
                           {"gopinath","K K","gopinath@gmail.com","gk@wh33h","98342556177","05/20/2022","hai"},
                               {"gopinath","K K","gopinath@gmail.com","s","98342556177","05/20/2022","hai"},
                               {"gopinath","K K","gopinath@gmail.com","gk@aw2@!wssssjjj","98342556177","05/20/2022","hai"},
                               {"gopinath","K K","gopinath@gmail.com","gk@","98342556177","05/20/2022","hai"},
                               {"gopinath","K K","gopinath@gmail.com","gk@","98342556177","05/20/2021","hai"},
                               {"gopinath","K K","gopinath@gmail.com","gk@","9870915101","05/20/2022","hai"},
                               {"gopinath","K K","gopinath@gmail.com","gk@","98342556177123433","05/20/2022","hai"},
                               {"gopinath","K K","gopinath@gmail.com","gk@","12334$%4555","05/20/2022","hai"}};                               
        return data;
        
    }
}