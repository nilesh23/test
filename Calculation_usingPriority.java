package project_Assessment;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Calculation_usingPriority {
	WebDriver driver;
  @Test(priority=1)
  public void multiplication() throws Exception {
	  Thread.sleep(5000);
	  //For multiplication
	  driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'×')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();
	  Thread.sleep(5000);
	  int actual_multi =222075,expected_multi=222075;  
	  Assert.assertEquals(actual_multi,expected_multi, "true");
	  System.out.println("Assert Passed for multiplication");
  }
  @Test(priority=2)
  public void division() throws Exception {
	  //For Division
	  driver.navigate().refresh();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
	  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
	  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
	  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
	  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[4]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
	  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
	  Thread.sleep(5000);
	  int actual_division=20,expected_division=20;  
	  Assert.assertEquals(actual_division,expected_division, "true");
	  System.out.println("Assert Passed for division");
  }
  @Test(priority=3)
  public void addition() throws Exception {
	  //For Addition 
	  driver.navigate().refresh();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
	  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/span[4]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();
	  Thread.sleep(5000);
	  int actual_addition=111111,expected_addition=111111;  
	  Assert.assertEquals(actual_addition,expected_addition, "true");
	  System.out.println("Assert Passed for addition");
  }
  @Test(priority=4)
  public void substraction() throws Exception {
	  //For Substraction
	  driver.navigate().refresh();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'8')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
	  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'9')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'8')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
	  Thread.sleep(5000);
	  int actual_substraction=23329646,expected_substraction=23329646;  
	  Assert.assertEquals(actual_substraction,expected_substraction, "true");
	  System.out.println("Assert Passed for substraction");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Assessment\\projectAssessment\\chromeDriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.calculator.net/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
