package project_Assessment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Calculation_Simple {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.get("https://www.calculator.net/");
	  Thread.sleep(5000);
	  //For Multiplication 
	  driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'×')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();
	  int actual_multi =222075,expected_multi=222075;  
	  Assert.assertEquals(actual_multi,expected_multi, "true");
	  System.out.println("Assert Passed for multiplication");
	  Thread.sleep(5000);
	  driver.navigate().refresh();
	  Thread.sleep(5000);
	//For Division 
	  driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
	  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
	  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
	  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
	  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[4]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
	  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
	  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
	  int actual_division=20,expected_division=20;  
	  Assert.assertEquals(actual_division,expected_division, "true");
	  System.out.println("Assert Passed for division");
	  Thread.sleep(5000);
	  driver.navigate().refresh();
	  Thread.sleep(5000);
	  //For Addition
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
	  int actual_addition=111111,expected_addition=111111;  
	  Assert.assertEquals(actual_addition,expected_addition, "true");
	  System.out.println("Assert Passed for addition");
	  Thread.sleep(5000);
	  driver.navigate().refresh();
	  Thread.sleep(5000);
	  //For Substraction
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
	  int actual_substraction=23329646,expected_substraction=23329646;  
	  Assert.assertEquals(actual_substraction,expected_substraction, "true");
	  System.out.println("Assert Passed for substraction");
	  Thread.sleep(5000);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Assessment\\projectAssessment\\chromeDriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
