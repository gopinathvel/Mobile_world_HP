import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homepage {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\gopinath.kk\\Downloads\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://mobileworld.banyanpro.com/");
  }
}
